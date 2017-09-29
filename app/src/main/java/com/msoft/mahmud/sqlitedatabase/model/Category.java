package com.msoft.mahmud.sqlitedatabase.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

import java.io.Serializable;

public class Category implements Serializable{
    public final ObservableInt catId = new ObservableInt();
    public final ObservableField<String> description =
            new ObservableField<String>();

    public Category () {

    }
    public Category(int i, String d) {
        catId.set(i);
        description.set(d);
    }
}
