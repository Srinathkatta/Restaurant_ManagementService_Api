package com.srinath.Restaurant.mangaement.system.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SignUpOutput {

    private boolean signUpStatus;
    private String signUpStatusMessage;

    public SignUpOutput(boolean signUpStatus, String s) {
    }
}
