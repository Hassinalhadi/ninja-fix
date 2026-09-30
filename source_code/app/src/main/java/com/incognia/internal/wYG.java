package com.incognia.internal;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pf.AbstractC2360j;

/* loaded from: classes2.dex */
public final class wYG extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final wYG f11750b = new wYG();

    public wYG() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NetworkInterface networkInterface = (NetworkInterface) obj;
        String name = networkInterface.getName();
        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
        Intrinsics.echo(inetAddresses, "<this>");
        return new zVT(name, AbstractC2360j.quebec(AbstractC2360j.papa(AbstractC2360j.charlie(new M.h(inetAddresses)), uyJ.f11508b)));
    }
}
