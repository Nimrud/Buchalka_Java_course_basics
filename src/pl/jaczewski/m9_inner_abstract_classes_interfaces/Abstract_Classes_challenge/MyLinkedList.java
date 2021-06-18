package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes_challenge;

public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {    // lista jest pusta
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem jest większy, trzeba go przesunąć naprzód, jeśli można
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // dotarliśmy do końca listy, umieszczamy tam nowy obiekt
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                } else {
                    // dotarliśmy do pierwszego elementu listy
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
                return true;
            } else {
                // oba obiekty są takie same, nie dopuszczamy duplikatów
                System.out.println(newItem.getValue() + " is already in the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem itemToDelete) {
        if (itemToDelete != null) {
            System.out.println("Deleting item " + itemToDelete.getValue());

            ListItem currentItem = root;
            while(currentItem != null) {
                int comparison = currentItem.compareTo(itemToDelete);
                if (comparison == 0) {
                    if (currentItem == root) {
                        root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if (currentItem.next() != null) {
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;
                } else if (comparison < 0) {
                    currentItem = currentItem.next();
                } else {
                    // comparison > 0
                    // bieżący element jest większy niż ten, który chcemy usunąć
                    // więc itemToDelete nie znajduje się na liście
                    return false;
                }
            }
        }
        // dotarliśmy do końca listy bez znalezienia na niej itemToDelete
        return false;
    }

    @Override
    public void moveThroughList(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
