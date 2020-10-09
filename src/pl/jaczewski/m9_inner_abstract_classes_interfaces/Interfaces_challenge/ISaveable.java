package pl.jaczewski.m9_inner_abstract_classes_interfaces.Interfaces_challenge;

import java.util.List;

public interface ISaveable {
    List<String> saveObject();
    void populateFields(List<String> savedValues);
}
