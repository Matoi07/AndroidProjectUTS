package com.adhitya.uts_adhityadwicahyana_10116010.utils;

public enum DatabaseContents {
    DATABASE("loginsederhana.db"),
    TABLE_USERS("tbl_users");
    private String name;
    private DatabaseContents(String name) {
        this.name = name;
    }
    public String toString(){
        return name;
    }
}
