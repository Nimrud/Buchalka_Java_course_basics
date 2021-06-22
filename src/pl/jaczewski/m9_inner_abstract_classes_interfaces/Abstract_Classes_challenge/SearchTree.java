package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes_challenge;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // 'drzewo' jest puste, więc newItem zostaje rootem (headem)
            this.root = newItem;
            return true;
        }

        // w innym wypadku - zaczynamy porównywanie od roota (heada)
        ListItem currentItem = this.root;
        while (currentItem != null) {
            // w przypadku Search Tree dodanie elementu ZAWSZE jest na końcu ścieżki
            // więc idziemy w prawo lub lewo, aż dojdziemy do ostatniego elementu
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem jest większy, przesuwamy w prawo, jeśli to możliwe
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // nie ma następnego elementu, więc dodajemy tam newItem
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem jest mniejszy, przesuwamy w lewo, jeśli to możliwe
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // nie ma elementu po lewej stronie, więc dodajemy tam newItem
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public void moveThroughList(ListItem root) {
        // metoda rekursywna
        if (root != null) {
            moveThroughList(root.previous());
            System.out.println(root.getValue());
            moveThroughList(root.next());
        }
    }

    // removeItem() <- kod tej metody autorstwa Tima Buchalki (skomplikowane!)
    // z powodu tego skomplikowania, operacje usuwania rekordów w bazach
    // wykorzystujących SearchTree często są wykonywane jedynie podczas przerw technicznych,
    // podczas bieżącej pracy rekordy są jedynie oflagowane jako przeznaczone do skasowania,
    // więc są ignorowane podczas operacji na danych
    @Override
    public boolean removeItem(ListItem listItem) {
        if (listItem != null) {
            System.out.println("Deleting item " + listItem.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(listItem));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    // performRemoval() <- kod tej metody autorstwa Tima Buchalki (skomplikowane!)
    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue((String) current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }

}
