package T;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import bv.ah;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.InterfaceC2554n;
import s0.L;
import s0.Q;
import t0.C2946x;
import td.C3117a;
import vf.H;
import vf.I;
import vf.J;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public abstract class r implements InterfaceC2554n {
    public static final int $stable = 8;

    @Nullable
    private r child;

    @Nullable
    private L coordinator;

    @Nullable
    private Function0<Unit> detachedListener;
    private boolean insertedNodeAwaitingAttachForInvalidation;
    private boolean isAttached;
    private int kindSet;
    private boolean onAttachRunExpected;
    private boolean onDetachRunExpected;

    @Nullable
    private Q ownerScope;

    @Nullable
    private r parent;

    @Nullable
    private ab scope;
    private boolean updatedNodeAwaitingAttachForInvalidation;

    @NotNull
    private r node = this;
    private int aggregateChildKindSet = -1;

    public static /* synthetic */ void getNode$annotations() {
    }

    public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
    }

    public final int getAggregateChildKindSet$ui_release() {
        return this.aggregateChildKindSet;
    }

    @Nullable
    public final r getChild$ui_release() {
        return this.child;
    }

    @Nullable
    public final L getCoordinator$ui_release() {
        return this.coordinator;
    }

    @NotNull
    public final ab getCoroutineScope() {
        ab abVar = this.scope;
        if (abVar == null) {
            C3117a charlie = ad.charlie(((C2946x) AbstractC2555o.hotel(this)).getCoroutineContext().plus(new J((I) ((C2946x) AbstractC2555o.hotel(this)).getCoroutineContext().get(H.alpha))));
            this.scope = charlie;
            return charlie;
        }
        return abVar;
    }

    @Nullable
    public final Function0<Unit> getDetachedListener$ui_release() {
        return this.detachedListener;
    }

    public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.insertedNodeAwaitingAttachForInvalidation;
    }

    public final int getKindSet$ui_release() {
        return this.kindSet;
    }

    @Override // s0.InterfaceC2554n
    @NotNull
    public final r getNode() {
        return this.node;
    }

    @Nullable
    public final Q getOwnerScope$ui_release() {
        return this.ownerScope;
    }

    @Nullable
    public final r getParent$ui_release() {
        return this.parent;
    }

    public boolean getShouldAutoInvalidate() {
        return true;
    }

    public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
        return this.updatedNodeAwaitingAttachForInvalidation;
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    /* renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
    public final boolean m3isKindH91voCI$ui_release(int i4) {
        if ((i4 & getKindSet$ui_release()) != 0) {
            return true;
        }
        return false;
    }

    public void markAsAttached$ui_release() {
        boolean z2;
        if (this.isAttached) {
            AbstractC2264a.bravo("node attached multiple times");
        }
        if (this.coordinator != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC2264a.bravo("attach invoked on a node without a coordinator");
        }
        this.isAttached = true;
        this.onAttachRunExpected = true;
    }

    public void markAsDetached$ui_release() {
        if (!this.isAttached) {
            AbstractC2264a.bravo("Cannot detach a node that is not attached");
        }
        if (this.onAttachRunExpected) {
            AbstractC2264a.bravo("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.onDetachRunExpected) {
            AbstractC2264a.bravo("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.isAttached = false;
        ab abVar = this.scope;
        if (abVar != null) {
            ad.kilo(abVar, new ModifierNodeDetachedCancellationException());
            this.scope = null;
        }
    }

    public boolean november() {
        return isAttached();
    }

    public void onAttach() {
    }

    public /* synthetic */ void onDensityChange() {
    }

    public void onDetach() {
    }

    public /* synthetic */ void onLayoutDirectionChange() {
    }

    public void onReset() {
    }

    public void reset$ui_release() {
        if (!this.isAttached) {
            AbstractC2264a.bravo("reset() called on an unattached node");
        }
        onReset();
    }

    public void runAttachLifecycle$ui_release() {
        if (!this.isAttached) {
            AbstractC2264a.bravo("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.onAttachRunExpected) {
            AbstractC2264a.bravo("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.onAttachRunExpected = false;
        onAttach();
        this.onDetachRunExpected = true;
    }

    public void runDetachLifecycle$ui_release() {
        if (!this.isAttached) {
            AbstractC2264a.bravo("node detached multiple times");
        }
        if (this.coordinator == null) {
            AbstractC2264a.bravo("detach invoked on a node without a coordinator");
        }
        if (!this.onDetachRunExpected) {
            AbstractC2264a.bravo("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.onDetachRunExpected = false;
        Function0<Unit> function0 = this.detachedListener;
        if (function0 != null) {
            function0.invoke();
        }
        onDetach();
    }

    public final void setAggregateChildKindSet$ui_release(int i4) {
        this.aggregateChildKindSet = i4;
    }

    public void setAsDelegateTo$ui_release(@NotNull r rVar) {
        this.node = rVar;
    }

    public final void setChild$ui_release(@Nullable r rVar) {
        this.child = rVar;
    }

    public final void setDetachedListener$ui_release(@Nullable Function0<Unit> function0) {
        this.detachedListener = function0;
    }

    public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z2) {
        this.insertedNodeAwaitingAttachForInvalidation = z2;
    }

    public final void setKindSet$ui_release(int i4) {
        this.kindSet = i4;
    }

    public final void setOwnerScope$ui_release(@Nullable Q q4) {
        this.ownerScope = q4;
    }

    public final void setParent$ui_release(@Nullable r rVar) {
        this.parent = rVar;
    }

    public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z2) {
        this.updatedNodeAwaitingAttachForInvalidation = z2;
    }

    public final void sideEffect(@NotNull Function0<Unit> function0) {
        ah ahVar = ((C2946x) AbstractC2555o.hotel(this)).f13903o0;
        if (ahVar.charlie(function0) >= 0) {
            return;
        }
        ahVar.golf(function0);
    }

    public void updateCoordinator$ui_release(@Nullable L l10) {
        this.coordinator = l10;
    }
}
