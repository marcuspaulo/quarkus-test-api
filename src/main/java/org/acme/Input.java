package org.acme;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class Input {
    private String name;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
