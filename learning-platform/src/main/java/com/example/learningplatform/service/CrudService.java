package com.example.learningplatform.service;

import java.util.List;
import java.util.Map;


public interface CrudService<Read, Create, Update, Id> {
    public List<Read>readAll();

    public Read readOne(Id id);

    public Read read(Map<String, String> params);

    public Read create(Create createDto);

    public Read update(Update updateDto);

    public Read delete(Id id);
}
