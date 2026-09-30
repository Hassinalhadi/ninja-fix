package com.incognia.internal;

import g9.a;

/* loaded from: classes2.dex */
public abstract class DF7 {
    public static void W(tcn tcnVar) {
        tcnVar.b().b(new a(2, tcnVar));
    }

    public static void b(tcn tcnVar) {
        boolean gmP = tcnVar.gmP();
        tcnVar.b(tcnVar.W());
        if (gmP != tcnVar.gmP()) {
            if (tcnVar.gmP()) {
                tcnVar.PqK();
            } else {
                tcnVar.olU();
            }
        }
    }

    public static void f9(tcn tcnVar) {
        tcnVar.V();
    }
}
