package pl.jaczewski.m9_Inner_Abstract_Classes_Interfaces.Interfaces_challenge;

import java.util.List;

public interface ISaveable {
    List<String> saveObject();
    void populateFields(List<String> savedValues);
}
