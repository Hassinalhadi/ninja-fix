package zendesk.core;

/* loaded from: classes.dex */
class BlipsPermissions {
    private boolean behavioural;
    private boolean pathfinder;
    private boolean required;

    /* renamed from: zendesk.core.BlipsPermissions$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$BlipsGroup;

        static {
            int[] iArr = new int[BlipsGroup.values().length];
            $SwitchMap$zendesk$core$BlipsGroup = iArr;
            try {
                iArr[BlipsGroup.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.BEHAVIOURAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$core$BlipsGroup[BlipsGroup.PATHFINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BlipsPermissions(boolean z2, boolean z10, boolean z11) {
        this.required = z2;
        this.behavioural = z10;
        this.pathfinder = z11;
    }

    public boolean isEnabled(BlipsGroup blipsGroup) {
        int i4 = AnonymousClass1.$SwitchMap$zendesk$core$BlipsGroup[blipsGroup.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return false;
                }
                return this.pathfinder;
            }
            return this.behavioural;
        }
        return this.required;
    }

    public BlipsPermissions() {
        this(false, false, false);
    }
}
