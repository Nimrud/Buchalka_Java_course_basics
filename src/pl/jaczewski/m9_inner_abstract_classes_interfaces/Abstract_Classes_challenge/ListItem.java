package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes_challenge;

public abstract class ListItem {
    protected Object value;
    protected ListItem previousObject = null;
    protected ListItem nextObject = null;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
    abstract ListItem setNext(ListItem listItem);

    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public ListItem setValue(String value) {
        this.value = value;
        return this;
    }
}
