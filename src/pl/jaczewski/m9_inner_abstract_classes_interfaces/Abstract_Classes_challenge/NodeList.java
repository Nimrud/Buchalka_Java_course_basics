package pl.jaczewski.m9_inner_abstract_classes_interfaces.Abstract_Classes_challenge;

public interface NodeList {
    ListItem getRoot();    // metoda do odczytania początku listy
    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem listItem);
    void moveThroughList(ListItem root);  // odczytanie listy od elementu root
}
