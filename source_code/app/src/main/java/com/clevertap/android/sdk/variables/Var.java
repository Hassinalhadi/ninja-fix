package com.clevertap.android.sdk.variables;

import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.variables.callbacks.VariableCallback;
import com.google.android.material.datepicker.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class Var<T> {
    private static boolean printedCallbackWarning;
    private final CTVariables ctVariables;
    private T defaultValue;
    private String kind;
    private String name;
    private String[] nameComponents;
    private Double numberValue;
    public String stringValue;
    private T value;
    private boolean hadStarted = false;
    private final List<VariableCallback<T>> valueChangedHandlers = new ArrayList();
    private final List<VariableCallback<T>> fileReadyHandlers = new ArrayList();

    public Var(CTVariables cTVariables) {
        this.ctVariables = cTVariables;
    }

    private void cacheComputedValues() {
        T t5 = this.value;
        if (t5 instanceof String) {
            String str = (String) t5;
            this.stringValue = str;
            modifyNumberValue(str);
            modifyValue(this.numberValue);
            return;
        }
        if (t5 instanceof Number) {
            this.stringValue = "" + this.value;
            this.numberValue = Double.valueOf(((Number) this.value).doubleValue());
            modifyValue((Number) this.value);
            return;
        }
        if (t5 != null && !(t5 instanceof Iterable) && !(t5 instanceof Map)) {
            this.stringValue = t5.toString();
            this.numberValue = null;
        } else {
            this.stringValue = null;
            this.numberValue = null;
        }
    }

    public static <T> Var<T> define(String str, T t5, CTVariables cTVariables) {
        return define(str, t5, CTVariableUtils.kindFromValue(t5), cTVariables);
    }

    private static void log(String str) {
        Logger.v("variable", str);
    }

    private void modifyNumberValue(String str) {
        try {
            this.numberValue = Double.valueOf(str);
        } catch (NumberFormatException unused) {
            this.numberValue = null;
            T t5 = this.defaultValue;
            if (t5 instanceof Number) {
                this.numberValue = Double.valueOf(((Number) t5).doubleValue());
            }
        }
    }

    private void modifyValue(Number number) {
        if (number != null) {
            T t5 = this.defaultValue;
            if (t5 instanceof Byte) {
                this.value = (T) Byte.valueOf(number.byteValue());
                return;
            }
            if (t5 instanceof Short) {
                this.value = (T) Short.valueOf(number.shortValue());
                return;
            }
            if (t5 instanceof Integer) {
                this.value = (T) Integer.valueOf(number.intValue());
                return;
            }
            if (t5 instanceof Long) {
                this.value = (T) Long.valueOf(number.longValue());
                return;
            }
            if (t5 instanceof Float) {
                this.value = (T) Float.valueOf(number.floatValue());
            } else if (t5 instanceof Double) {
                this.value = (T) Double.valueOf(number.doubleValue());
            } else if (t5 instanceof Character) {
                this.value = (T) Character.valueOf((char) number.intValue());
            }
        }
    }

    private void triggerValueChanged() {
        synchronized (this.valueChangedHandlers) {
            try {
                for (VariableCallback<T> variableCallback : this.valueChangedHandlers) {
                    variableCallback.setVariable(this);
                    Utils.runOnUiThread(variableCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFileReadyHandler(VariableCallback<T> variableCallback) {
        synchronized (this.fileReadyHandlers) {
            this.fileReadyHandlers.add(variableCallback);
        }
    }

    public void addValueChangedCallback(VariableCallback<T> variableCallback) {
        if (variableCallback == null) {
            log("Invalid callback parameter provided.");
            return;
        }
        synchronized (this.valueChangedHandlers) {
            this.valueChangedHandlers.add(variableCallback);
        }
        if (this.ctVariables.hasVarsRequestCompleted().booleanValue()) {
            variableCallback.onValueChanged(this);
        }
    }

    public void clearStartFlag() {
        this.hadStarted = false;
    }

    public T defaultValue() {
        return this.defaultValue;
    }

    public String kind() {
        return this.kind;
    }

    public String name() {
        return this.name;
    }

    public String[] nameComponents() {
        return this.nameComponents;
    }

    public Number numberValue() {
        warnIfNotStarted();
        return this.numberValue;
    }

    public String rawFileValue() {
        if (CTVariableUtils.FILE.equals(this.kind)) {
            return this.stringValue;
        }
        return null;
    }

    public void removeFileReadyHandler(VariableCallback<T> variableCallback) {
        synchronized (this.fileReadyHandlers) {
            this.fileReadyHandlers.remove(variableCallback);
        }
    }

    public void removeValueChangedHandler(VariableCallback<T> variableCallback) {
        synchronized (this.valueChangedHandlers) {
            this.valueChangedHandlers.remove(variableCallback);
        }
    }

    public String stringValue() {
        warnIfNotStarted();
        if (CTVariableUtils.FILE.equals(this.kind)) {
            return this.ctVariables.getVarCache().filePathFromDisk(this.stringValue);
        }
        return this.stringValue;
    }

    public String toString() {
        if (CTVariableUtils.FILE.equals(this.kind)) {
            return j.lima(new StringBuilder("Var("), this.name, Constants.SEPARATOR_COMMA, this.ctVariables.getVarCache().filePathFromDisk(this.stringValue), ")");
        }
        StringBuilder sb2 = new StringBuilder("Var(");
        sb2.append(this.name);
        sb2.append(Constants.SEPARATOR_COMMA);
        return P0.emerald(sb2, this.value, ")");
    }

    public void triggerFileIsReady() {
        synchronized (this.fileReadyHandlers) {
            try {
                for (VariableCallback<T> variableCallback : this.fileReadyHandlers) {
                    variableCallback.setVariable(this);
                    Utils.runOnUiThread(variableCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void update() {
        T t5 = this.value;
        T t10 = (T) this.ctVariables.getVarCache().getMergedValueFromComponentArray(this.nameComponents);
        this.value = t10;
        if (t10 == null && t5 == null) {
            return;
        }
        if (t10 != null && t10.equals(t5) && this.hadStarted) {
            return;
        }
        cacheComputedValues();
        if (this.ctVariables.hasVarsRequestCompleted().booleanValue()) {
            this.hadStarted = true;
            triggerValueChanged();
            if (CTVariableUtils.FILE.equals(this.kind)) {
                this.ctVariables.getVarCache().fileVarUpdated(this);
            }
        }
    }

    public T value() {
        warnIfNotStarted();
        if (CTVariableUtils.FILE.equals(this.kind)) {
            return (T) this.ctVariables.getVarCache().filePathFromDisk(this.stringValue);
        }
        return this.value;
    }

    public void warnIfNotStarted() {
        if (!this.ctVariables.hasVarsRequestCompleted().booleanValue() && !printedCallbackWarning) {
            log(P0.gold(new StringBuilder("CleverTap hasn't finished retrieving values from the server. You should use a callback to make sure the value for "), this.name, " is ready. Otherwise, your app may not use the most up-to-date value."));
            printedCallbackWarning = true;
        }
    }

    public static <T> Var<T> define(String str, T t5, String str2, CTVariables cTVariables) {
        if (TextUtils.isEmpty(str)) {
            log("Empty name parameter provided.");
            return null;
        }
        if (!str.startsWith(".") && !str.endsWith(".")) {
            if (!CTVariableUtils.FILE.equals(str2) && t5 == null) {
                Logger.d("Invalid Operation! Null values are not allowed as default values when defining the variable '" + str + "'.");
                return null;
            }
            Var<T> variable = cTVariables.getVarCache().getVariable(str);
            if (variable != null) {
                return variable;
            }
            Var<T> var = new Var<>(cTVariables);
            try {
                ((Var) var).name = str;
                ((Var) var).nameComponents = CTVariableUtils.getNameComponents(str);
                ((Var) var).defaultValue = t5;
                ((Var) var).value = t5;
                ((Var) var).kind = str2;
                var.cacheComputedValues();
                cTVariables.getVarCache().registerVariable(var);
                var.update();
                return var;
            } catch (Throwable th) {
                th.printStackTrace();
                return var;
            }
        }
        log("Variable name starts or ends with a `.` which is not allowed: ".concat(str));
        return null;
    }
}
