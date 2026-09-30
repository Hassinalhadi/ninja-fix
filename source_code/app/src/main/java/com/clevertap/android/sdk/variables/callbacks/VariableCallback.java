package com.clevertap.android.sdk.variables.callbacks;

import com.clevertap.android.sdk.variables.Var;

/* loaded from: classes3.dex */
public abstract class VariableCallback<T> implements Runnable {
    private Var<T> variable;

    public abstract void onValueChanged(Var<T> var);

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.variable) {
            onValueChanged(this.variable);
        }
    }

    public void setVariable(Var<T> var) {
        this.variable = var;
    }
}
