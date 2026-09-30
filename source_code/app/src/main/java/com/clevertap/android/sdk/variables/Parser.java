package com.clevertap.android.sdk.variables;

import android.text.TextUtils;
import ao.ad;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.variables.annotations.Variable;
import com.clevertap.android.sdk.variables.callbacks.VariableCallback;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes3.dex */
public class Parser {
    private final CTVariables ctVariables;

    public Parser(CTVariables cTVariables) {
        this.ctVariables = cTVariables;
    }

    private static void log(String str) {
        Logger.v("variables", str);
    }

    public <T> void defineVariable(Object obj, String str, T t5, String str2, final Field field) {
        boolean z2;
        final Var define = Var.define(str, t5, str2, this.ctVariables);
        if (define == null) {
            log(ad.gray("Something went wrong, variable '", str, "' is null, returning"));
            return;
        }
        if (obj != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final boolean z10 = z2;
        final WeakReference weakReference = new WeakReference(obj);
        define.addValueChangedCallback(new VariableCallback<T>() { // from class: com.clevertap.android.sdk.variables.Parser.1
            @Override // com.clevertap.android.sdk.variables.callbacks.VariableCallback
            public void onValueChanged(Var<T> var) {
                Field field2;
                Object obj2 = weakReference.get();
                if ((z10 && obj2 == null) || (field2 = field) == null) {
                    define.removeValueChangedHandler(this);
                    return;
                }
                try {
                    boolean isAccessible = field2.isAccessible();
                    if (!isAccessible) {
                        field.setAccessible(true);
                    }
                    field.set(obj2, define.value());
                    if (!isAccessible) {
                        field.setAccessible(false);
                    }
                } catch (IllegalAccessException e) {
                    Parser.log("Error setting value for field " + define.name(), e);
                } catch (IllegalArgumentException e4) {
                    Parser.log("Invalid value " + define.value() + " for field " + define.name(), e4);
                }
            }
        });
    }

    public void parseVariables(Object... objArr) {
        try {
            for (Object obj : objArr) {
                parseVariablesHelper(obj, obj.getClass());
            }
        } catch (Throwable th) {
            log("Error parsing variables", th);
        }
    }

    public void parseVariablesForClasses(Class<?>... clsArr) {
        try {
            for (Class<?> cls : clsArr) {
                parseVariablesHelper(null, cls);
            }
        } catch (Throwable th) {
            log("Error parsing variables", th);
        }
    }

    public void parseVariablesHelper(Object obj, Class<?> cls) {
        Object obj2;
        String str;
        String str2;
        String obj3;
        try {
            Field[] fields = cls.getFields();
            int length = fields.length;
            int i4 = 0;
            while (i4 < length) {
                Field field = fields[i4];
                if (field.isAnnotationPresent(Variable.class)) {
                    Variable variable = (Variable) field.getAnnotation(Variable.class);
                    if (variable != null) {
                        str = variable.group();
                        str2 = variable.name();
                    } else {
                        str = "";
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = field.getName();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + "." + str2;
                    }
                    String str3 = str2;
                    Class<?> type = field.getType();
                    String cls2 = type.toString();
                    if (cls2.equals("int")) {
                        Object obj4 = obj;
                        defineVariable(obj4, str3, Integer.valueOf(field.getInt(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj4;
                    } else if (cls2.equals("byte")) {
                        Object obj5 = obj;
                        defineVariable(obj5, str3, Byte.valueOf(field.getByte(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj5;
                    } else if (cls2.equals("short")) {
                        Object obj6 = obj;
                        defineVariable(obj6, str3, Short.valueOf(field.getShort(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj6;
                    } else if (cls2.equals("long")) {
                        Object obj7 = obj;
                        defineVariable(obj7, str3, Long.valueOf(field.getLong(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj7;
                    } else if (cls2.equals("char")) {
                        Object obj8 = obj;
                        defineVariable(obj8, str3, Character.valueOf(field.getChar(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj8;
                    } else if (cls2.equals("float")) {
                        Object obj9 = obj;
                        defineVariable(obj9, str3, Float.valueOf(field.getFloat(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj9;
                    } else if (cls2.equals("double")) {
                        Object obj10 = obj;
                        defineVariable(obj10, str3, Double.valueOf(field.getDouble(obj)), CTVariableUtils.NUMBER, field);
                        obj = obj10;
                    } else {
                        if (cls2.equals(CTVariableUtils.BOOLEAN)) {
                            obj2 = obj;
                            defineVariable(obj2, str3, Boolean.valueOf(field.getBoolean(obj)), CTVariableUtils.BOOLEAN, field);
                        } else {
                            obj2 = obj;
                            if (type.isPrimitive()) {
                                log("Variable " + str3 + " is an unsupported primitive type.");
                            } else if (type.isArray()) {
                                log("Variable " + str3 + " is an unsupported type of Array.");
                            } else if (Map.class.isAssignableFrom(type)) {
                                defineVariable(obj2, str3, field.get(obj2), CTVariableUtils.DICTIONARY, field);
                            } else {
                                Object obj11 = field.get(obj2);
                                if (obj11 == null) {
                                    obj3 = null;
                                } else {
                                    obj3 = obj11.toString();
                                }
                                defineVariable(obj2, str3, obj3, CTVariableUtils.STRING, field);
                            }
                        }
                        i4++;
                        obj = obj2;
                    }
                }
                obj2 = obj;
                i4++;
                obj = obj2;
            }
        } catch (Throwable th) {
            log("Error parsing variables:", th);
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void log(String str, Throwable th) {
        Logger.v("variables", str, th);
    }
}
