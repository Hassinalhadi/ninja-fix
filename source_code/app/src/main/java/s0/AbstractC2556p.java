package s0;

import B9.C0058p;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;

/* renamed from: s0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2556p extends T.r {
    public final int alpha = M.foxtrot(this);
    public T.r purple;

    public final void b(InterfaceC2554n interfaceC2554n) {
        T.r rVar;
        T.r node = interfaceC2554n.getNode();
        T.r rVar2 = null;
        if (node != interfaceC2554n) {
            if (interfaceC2554n instanceof T.r) {
                rVar = (T.r) interfaceC2554n;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                rVar2 = rVar.getParent$ui_release();
            }
            if (node != getNode() || !Intrinsics.areEqual(rVar2, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (node.isAttached()) {
            AbstractC2264a.bravo("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int golf = M.golf(node);
        node.setKindSet$ui_release(golf);
        int kindSet$ui_release2 = getKindSet$ui_release();
        int i4 = golf & 2;
        if (i4 != 0 && (kindSet$ui_release2 & 2) != 0 && !(this instanceof ab)) {
            AbstractC2264a.bravo("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui_release(this.purple);
        this.purple = node;
        node.setParent$ui_release(this);
        d(golf | getKindSet$ui_release(), false);
        if (isAttached()) {
            if (i4 != 0 && (kindSet$ui_release & 2) == 0) {
                C0058p c0058p = AbstractC2555o.golf(this).f13305x;
                getNode().updateCoordinator$ui_release(null);
                c0058p.india();
            } else {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            M.alpha(node);
        }
    }

    public final void c(InterfaceC2554n interfaceC2554n) {
        T.r rVar = null;
        for (T.r rVar2 = this.purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
            if (rVar2 == interfaceC2554n) {
                if (rVar2.isAttached()) {
                    bv.ag agVar = M.alpha;
                    if (!rVar2.isAttached()) {
                        AbstractC2264a.bravo("autoInvalidateRemovedNode called on unattached node");
                    }
                    M.bravo(rVar2, -1, 2);
                    rVar2.runDetachLifecycle$ui_release();
                    rVar2.markAsDetached$ui_release();
                }
                rVar2.setAsDelegateTo$ui_release(rVar2);
                rVar2.setAggregateChildKindSet$ui_release(0);
                if (rVar == null) {
                    this.purple = rVar2.getChild$ui_release();
                } else {
                    rVar.setChild$ui_release(rVar2.getChild$ui_release());
                }
                rVar2.setChild$ui_release(null);
                rVar2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int golf = M.golf(this);
                d(golf, true);
                if (isAttached() && (kindSet$ui_release & 2) != 0 && (golf & 2) == 0) {
                    C0058p c0058p = AbstractC2555o.golf(this).f13305x;
                    getNode().updateCoordinator$ui_release(null);
                    c0058p.india();
                    return;
                }
                return;
            }
            rVar = rVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2554n).toString());
    }

    public final void d(int i4, boolean z2) {
        int i5;
        T.r child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i4);
        if (kindSet$ui_release != i4) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui_release(i4);
            }
            if (isAttached()) {
                T.r node = getNode();
                T.r rVar = this;
                while (rVar != null) {
                    i4 |= rVar.getKindSet$ui_release();
                    rVar.setKindSet$ui_release(i4);
                    if (rVar == node) {
                        break;
                    } else {
                        rVar = rVar.getParent$ui_release();
                    }
                }
                if (z2 && rVar == node) {
                    i4 = M.golf(node);
                    node.setKindSet$ui_release(i4);
                }
                if (rVar != null && (child$ui_release = rVar.getChild$ui_release()) != null) {
                    i5 = child$ui_release.getAggregateChildKindSet$ui_release();
                } else {
                    i5 = 0;
                }
                int i10 = i4 | i5;
                while (rVar != null) {
                    i10 |= rVar.getKindSet$ui_release();
                    rVar.setAggregateChildKindSet$ui_release(i10);
                    rVar = rVar.getParent$ui_release();
                }
            }
        }
    }

    @Override // T.r
    public final void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!rVar.isAttached()) {
                rVar.markAsAttached$ui_release();
            }
        }
    }

    @Override // T.r
    public final void markAsDetached$ui_release() {
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // T.r
    public final void reset$ui_release() {
        super.reset$ui_release();
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.reset$ui_release();
        }
    }

    @Override // T.r
    public final void runAttachLifecycle$ui_release() {
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // T.r
    public final void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.runDetachLifecycle$ui_release();
        }
    }

    @Override // T.r
    public final void setAsDelegateTo$ui_release(T.r rVar) {
        super.setAsDelegateTo$ui_release(rVar);
        for (T.r rVar2 = this.purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
            rVar2.setAsDelegateTo$ui_release(rVar);
        }
    }

    @Override // T.r
    public final void updateCoordinator$ui_release(L l10) {
        super.updateCoordinator$ui_release(l10);
        for (T.r rVar = this.purple; rVar != null; rVar = rVar.getChild$ui_release()) {
            rVar.updateCoordinator$ui_release(l10);
        }
    }
}
