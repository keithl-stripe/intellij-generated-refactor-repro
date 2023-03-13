package com.stripe.generatedrefactoringbug;

import com.stripe.generatedrefactoringbug.lib.NonGeneratedObject;
import com.stripe.generatedrefactoringbug.generatedjava.GeneratedJavaClass;
import com.stripe.generatedrefactoringbug.generatedscala.GeneratedScalaClass;

public class Main {
    public static void main(String[] args) {
        GeneratedJavaClass.print(new NonGeneratedObject());
        GeneratedScalaClass.print(new NonGeneratedObject());
    }
}