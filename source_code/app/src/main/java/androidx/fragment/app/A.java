package androidx.fragment.app;

/* loaded from: classes3.dex */
public final class A {
    public static final bv.aw bravo = new bv.aw(0);
    public final /* synthetic */ L alpha;

    public A(L l10) {
        this.alpha = l10;
    }

    public static Class bravo(ClassLoader classLoader, String str) {
        bv.aw awVar = bravo;
        bv.aw awVar2 = (bv.aw) awVar.get(classLoader);
        if (awVar2 == null) {
            awVar2 = new bv.aw(0);
            awVar.put(classLoader, awVar2);
        }
        Class cls = (Class) awVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            awVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class charlie(ClassLoader classLoader, String str) {
        try {
            return bravo(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e4) {
            throw new Fragment$InstantiationException(ao.ad.gray("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    public final ai alpha(String str) {
        return ai.instantiate(this.alpha.xray.purple, str, null);
    }
}
