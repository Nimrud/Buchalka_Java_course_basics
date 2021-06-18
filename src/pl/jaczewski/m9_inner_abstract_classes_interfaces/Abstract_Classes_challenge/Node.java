package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes_challenge;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.nextObject;
    }

    @Override
    ListItem previous() {
        return this.previousObject;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.previousObject = listItem;
        return this.previousObject;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.nextObject = listItem;
        return this.nextObject;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            // castujemy na Stringa, a ten ma własną metodę 'compare to':
            return ((String) super.getValue()).compareTo((String) listItem.getValue());
        } else {
            return -1;
        }
    }
}
