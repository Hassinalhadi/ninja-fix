package com.google.firebase.messaging;

import b8.C0732b;
import b8.InterfaceC0733c;
import b8.InterfaceC0734d;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import e8.C1633a;
import e8.InterfaceC1637e;
import p8.C2293d;
import p8.EnumC2290a;
import p8.EnumC2292c;

/* loaded from: classes2.dex */
public final class a implements InterfaceC0733c {
    public static final a alpha = new Object();
    public static final C0732b bravo = new C0732b("projectNumber", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(1))));
    public static final C0732b charlie = new C0732b("messageId", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(2))));
    public static final C0732b delta = new C0732b("instanceId", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(3))));
    public static final C0732b echo = new C0732b("messageType", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(4))));
    public static final C0732b foxtrot = new C0732b("sdkPlatform", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(5))));
    public static final C0732b golf = new C0732b("packageName", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(6))));
    public static final C0732b hotel = new C0732b("collapseKey", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(7))));
    public static final C0732b india = new C0732b(Constants.INAPP_PRIORITY, A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(8))));
    public static final C0732b juliet = new C0732b("ttl", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(9))));
    public static final C0732b kilo = new C0732b("topic", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(10))));
    public static final C0732b lima = new C0732b("bulkId", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(11))));
    public static final C0732b mike = new C0732b(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(12))));
    public static final C0732b november = new C0732b("analyticsLabel", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(13))));
    public static final C0732b oscar = new C0732b(Column.CAMPAIGN, A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(14))));
    public static final C0732b papa = new C0732b("composerLabel", A0.z.november(A0.z.mike(InterfaceC1637e.class, new C1633a(15))));

    @Override // b8.InterfaceC0731a
    public final void alpha(Object obj, Object obj2) {
        C2293d c2293d = (C2293d) obj;
        InterfaceC0734d interfaceC0734d = (InterfaceC0734d) obj2;
        interfaceC0734d.foxtrot(bravo, c2293d.alpha);
        interfaceC0734d.alpha(charlie, c2293d.bravo);
        interfaceC0734d.alpha(delta, c2293d.charlie);
        interfaceC0734d.alpha(echo, c2293d.delta);
        interfaceC0734d.alpha(foxtrot, EnumC2292c.ANDROID);
        interfaceC0734d.alpha(golf, c2293d.echo);
        interfaceC0734d.alpha(hotel, c2293d.foxtrot);
        interfaceC0734d.echo(india, c2293d.golf);
        interfaceC0734d.echo(juliet, c2293d.hotel);
        interfaceC0734d.alpha(kilo, c2293d.india);
        interfaceC0734d.foxtrot(lima, 0L);
        interfaceC0734d.alpha(mike, EnumC2290a.MESSAGE_DELIVERED);
        interfaceC0734d.alpha(november, c2293d.juliet);
        interfaceC0734d.foxtrot(oscar, 0L);
        interfaceC0734d.alpha(papa, c2293d.kilo);
    }
}
