package kotlin.jvm.internal;

import ge.InterfaceC1771c;
import ge.InterfaceC1774f;
import ge.InterfaceC1783o;
import ge.ab;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class c implements InterfaceC1771c, Serializable {
    public static final Object NO_RECEIVER = b.alpha;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC1771c reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    @Override // ge.InterfaceC1771c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ge.InterfaceC1771c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC1771c compute() {
        InterfaceC1771c interfaceC1771c = this.reflected;
        if (interfaceC1771c == null) {
            InterfaceC1771c computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC1771c;
    }

    public abstract InterfaceC1771c computeReflected();

    @Override // ge.InterfaceC1770b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // ge.InterfaceC1771c
    public String getName() {
        return this.name;
    }

    public InterfaceC1774f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return u.alpha.charlie(cls, "");
        }
        return u.alpha.bravo(cls);
    }

    @Override // ge.InterfaceC1771c
    public List<InterfaceC1783o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC1771c getReflected();

    @Override // ge.InterfaceC1771c
    public ge.w getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ge.InterfaceC1771c
    public List<ge.x> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ge.InterfaceC1771c
    public ab getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ge.InterfaceC1771c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ge.InterfaceC1771c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ge.InterfaceC1771c
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
