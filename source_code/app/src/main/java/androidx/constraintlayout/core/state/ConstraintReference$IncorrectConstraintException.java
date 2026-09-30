package androidx.constraintlayout.core.state;

import java.util.ArrayList;

/* loaded from: classes3.dex */
class ConstraintReference$IncorrectConstraintException extends Exception {
    private final ArrayList<String> mErrors;

    public ConstraintReference$IncorrectConstraintException(ArrayList<String> arrayList) {
        this.mErrors = arrayList;
    }

    public ArrayList<String> getErrors() {
        return this.mErrors;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "IncorrectConstraintException: " + this.mErrors.toString();
    }
}
