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
    public boolean removeItem(ListItem listItem) {
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
}
