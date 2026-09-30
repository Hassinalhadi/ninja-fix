package s6;

import ge.InterfaceC1771c;
import ge.InterfaceC1775g;
import ge.InterfaceC1776h;
import ge.InterfaceC1781m;
import ge.InterfaceC1785q;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ke.InterfaceC2037e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2751q5 {
    public static final /* synthetic */ int alpha = 0;

    public static final boolean alpha(InterfaceC1771c interfaceC1771c) {
        boolean z2;
        Object obj;
        AccessibleObject accessibleObject;
        boolean z10;
        Object obj2;
        boolean z11;
        InterfaceC2037e quebec;
        InterfaceC2037e sierra;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        Intrinsics.echo(interfaceC1771c, "<this>");
        if (interfaceC1771c instanceof InterfaceC1781m) {
            ge.v vVar = (ge.v) interfaceC1771c;
            Field alpha2 = AbstractC2768s5.alpha(vVar);
            if (alpha2 != null) {
                z18 = alpha2.isAccessible();
            } else {
                z18 = true;
            }
            if (z18) {
                Method bravo = AbstractC2768s5.bravo(vVar.bravo());
                if (bravo != null) {
                    z19 = bravo.isAccessible();
                } else {
                    z19 = true;
                }
                if (z19) {
                    Method bravo2 = AbstractC2768s5.bravo(((InterfaceC1781m) interfaceC1771c).charlie());
                    if (bravo2 != null) {
                        z20 = bravo2.isAccessible();
                    } else {
                        z20 = true;
                    }
                    if (!z20) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1771c instanceof ge.v) {
            ge.v vVar2 = (ge.v) interfaceC1771c;
            Field alpha3 = AbstractC2768s5.alpha(vVar2);
            if (alpha3 != null) {
                z16 = alpha3.isAccessible();
            } else {
                z16 = true;
            }
            if (z16) {
                Method bravo3 = AbstractC2768s5.bravo(vVar2.bravo());
                if (bravo3 != null) {
                    z17 = bravo3.isAccessible();
                } else {
                    z17 = true;
                }
                if (!z17) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1771c instanceof InterfaceC1785q) {
            Field alpha4 = AbstractC2768s5.alpha(((InterfaceC1785q) interfaceC1771c).oscar());
            if (alpha4 != null) {
                z14 = alpha4.isAccessible();
            } else {
                z14 = true;
            }
            if (z14) {
                Method bravo4 = AbstractC2768s5.bravo((InterfaceC1775g) interfaceC1771c);
                if (bravo4 != null) {
                    z15 = bravo4.isAccessible();
                } else {
                    z15 = true;
                }
                if (!z15) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1771c instanceof InterfaceC1776h) {
            Field alpha5 = AbstractC2768s5.alpha(((InterfaceC1776h) interfaceC1771c).oscar());
            if (alpha5 != null) {
                z12 = alpha5.isAccessible();
            } else {
                z12 = true;
            }
            if (z12) {
                Method bravo5 = AbstractC2768s5.bravo((InterfaceC1775g) interfaceC1771c);
                if (bravo5 != null) {
                    z13 = bravo5.isAccessible();
                } else {
                    z13 = true;
                }
                if (!z13) {
                    return false;
                }
            } else {
                return false;
            }
        } else if (interfaceC1771c instanceof InterfaceC1775g) {
            InterfaceC1775g interfaceC1775g = (InterfaceC1775g) interfaceC1771c;
            Method bravo6 = AbstractC2768s5.bravo(interfaceC1775g);
            if (bravo6 != null) {
                z2 = bravo6.isAccessible();
            } else {
                z2 = true;
            }
            if (z2) {
                je.r alpha6 = je.a0.alpha(interfaceC1771c);
                Constructor constructor = null;
                if (alpha6 != null && (sierra = alpha6.sierra()) != null) {
                    obj = sierra.bravo();
                } else {
                    obj = null;
                }
                if (obj instanceof AccessibleObject) {
                    accessibleObject = (AccessibleObject) obj;
                } else {
                    accessibleObject = null;
                }
                if (accessibleObject != null) {
                    z10 = accessibleObject.isAccessible();
                } else {
                    z10 = true;
                }
                if (z10) {
                    je.r alpha7 = je.a0.alpha(interfaceC1775g);
                    if (alpha7 != null && (quebec = alpha7.quebec()) != null) {
                        obj2 = quebec.bravo();
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof Constructor) {
                        constructor = (Constructor) obj2;
                    }
                    if (constructor != null) {
                        z11 = constructor.isAccessible();
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + interfaceC1771c + " (" + interfaceC1771c.getClass() + ')');
        }
        return true;
    }

    public static final void bravo(InterfaceC1771c interfaceC1771c) {
        Object obj;
        AccessibleObject accessibleObject;
        Object obj2;
        InterfaceC2037e quebec;
        InterfaceC2037e sierra;
        if (interfaceC1771c instanceof InterfaceC1781m) {
            ge.v vVar = (ge.v) interfaceC1771c;
            Field alpha2 = AbstractC2768s5.alpha(vVar);
            if (alpha2 != null) {
                alpha2.setAccessible(true);
            }
            Method bravo = AbstractC2768s5.bravo(vVar.bravo());
            if (bravo != null) {
                bravo.setAccessible(true);
            }
            Method bravo2 = AbstractC2768s5.bravo(((InterfaceC1781m) interfaceC1771c).charlie());
            if (bravo2 != null) {
                bravo2.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1771c instanceof ge.v) {
            ge.v vVar2 = (ge.v) interfaceC1771c;
            Field alpha3 = AbstractC2768s5.alpha(vVar2);
            if (alpha3 != null) {
                alpha3.setAccessible(true);
            }
            Method bravo3 = AbstractC2768s5.bravo(vVar2.bravo());
            if (bravo3 != null) {
                bravo3.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1771c instanceof InterfaceC1785q) {
            Field alpha4 = AbstractC2768s5.alpha(((InterfaceC1785q) interfaceC1771c).oscar());
            if (alpha4 != null) {
                alpha4.setAccessible(true);
            }
            Method bravo4 = AbstractC2768s5.bravo((InterfaceC1775g) interfaceC1771c);
            if (bravo4 != null) {
                bravo4.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1771c instanceof InterfaceC1776h) {
            Field alpha5 = AbstractC2768s5.alpha(((InterfaceC1776h) interfaceC1771c).oscar());
            if (alpha5 != null) {
                alpha5.setAccessible(true);
            }
            Method bravo5 = AbstractC2768s5.bravo((InterfaceC1775g) interfaceC1771c);
            if (bravo5 != null) {
                bravo5.setAccessible(true);
                return;
            }
            return;
        }
        if (interfaceC1771c instanceof InterfaceC1775g) {
            InterfaceC1775g interfaceC1775g = (InterfaceC1775g) interfaceC1771c;
            Method bravo6 = AbstractC2768s5.bravo(interfaceC1775g);
            if (bravo6 != null) {
                bravo6.setAccessible(true);
            }
            je.r alpha6 = je.a0.alpha(interfaceC1771c);
            Constructor constructor = null;
            if (alpha6 != null && (sierra = alpha6.sierra()) != null) {
                obj = sierra.bravo();
            } else {
                obj = null;
            }
            if (obj instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) obj;
            } else {
                accessibleObject = null;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            je.r alpha7 = je.a0.alpha(interfaceC1775g);
            if (alpha7 != null && (quebec = alpha7.quebec()) != null) {
                obj2 = quebec.bravo();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Constructor) {
                constructor = (Constructor) obj2;
            }
            if (constructor == null) {
                return;
            }
            constructor.setAccessible(true);
            return;
        }
        throw new UnsupportedOperationException("Unknown callable: " + interfaceC1771c + " (" + interfaceC1771c.getClass() + ')');
    }
}
