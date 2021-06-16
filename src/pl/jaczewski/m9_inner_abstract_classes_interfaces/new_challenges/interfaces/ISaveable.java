package pl.jaczewski.m9_inner_abstract_classes_interfaces.new_challenges.interfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
