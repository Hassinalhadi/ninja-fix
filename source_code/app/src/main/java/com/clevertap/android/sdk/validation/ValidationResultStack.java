package com.clevertap.android.sdk.validation;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ValidationResultStack {
    private static final Object pendingValidationResultsLock = new Object();
    private ArrayList<ValidationResult> pendingValidationResults = new ArrayList<>();

    public ArrayList<ValidationResult> getPendingValidationResults() {
        return this.pendingValidationResults;
    }

    public ValidationResult popValidationResult() {
        ValidationResult validationResult;
        synchronized (pendingValidationResultsLock) {
            validationResult = null;
            try {
                if (!this.pendingValidationResults.isEmpty()) {
                    validationResult = this.pendingValidationResults.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return validationResult;
    }

    public void pushValidationResult(ValidationResult validationResult) {
        synchronized (pendingValidationResultsLock) {
            try {
                try {
                    int size = this.pendingValidationResults.size();
                    if (size > 50) {
                        ArrayList<ValidationResult> arrayList = new ArrayList<>();
                        for (int i4 = 10; i4 < size; i4++) {
                            arrayList.add(this.pendingValidationResults.get(i4));
                        }
                        arrayList.add(validationResult);
                        this.pendingValidationResults = arrayList;
                    } else {
                        this.pendingValidationResults.add(validationResult);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused) {
            }
        }
    }
}
