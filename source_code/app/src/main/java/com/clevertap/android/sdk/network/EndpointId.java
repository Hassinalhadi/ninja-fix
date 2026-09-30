package com.clevertap.android.sdk.network;

import Qd.a;
import com.clevertap.android.sdk.events.EventGroup;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/network/EndpointId;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "ENDPOINT_SPIKY", "ENDPOINT_A1", "ENDPOINT_HELLO", "ENDPOINT_DEFINE_VARS", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EndpointId {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EndpointId[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String identifier;
    public static final EndpointId ENDPOINT_SPIKY = new EndpointId("ENDPOINT_SPIKY", 0, "-spiky");
    public static final EndpointId ENDPOINT_A1 = new EndpointId("ENDPOINT_A1", 1, "/a1");
    public static final EndpointId ENDPOINT_HELLO = new EndpointId("ENDPOINT_HELLO", 2, "/hello");
    public static final EndpointId ENDPOINT_DEFINE_VARS = new EndpointId("ENDPOINT_DEFINE_VARS", 3, "/defineVars");

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/clevertap/android/sdk/network/EndpointId$Companion;", "", "<init>", "()V", "fromString", "Lcom/clevertap/android/sdk/network/EndpointId;", "identifier", "", "fromEventGroup", "eventGroup", "Lcom/clevertap/android/sdk/events/EventGroup;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EventGroup.values().length];
                try {
                    iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventGroup.REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EventGroup.VARIABLES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EndpointId fromEventGroup(@NotNull EventGroup eventGroup) {
            Intrinsics.echo(eventGroup, "eventGroup");
            int i4 = WhenMappings.$EnumSwitchMapping$0[eventGroup.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        return EndpointId.ENDPOINT_DEFINE_VARS;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return EndpointId.ENDPOINT_A1;
            }
            return EndpointId.ENDPOINT_SPIKY;
        }

        @NotNull
        public final EndpointId fromString(@NotNull String identifier) {
            EndpointId endpointId;
            Intrinsics.echo(identifier, "identifier");
            EndpointId[] values = EndpointId.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    endpointId = values[i4];
                    if (StringsKt.beige(identifier, endpointId.getIdentifier(), false)) {
                        break;
                    }
                    i4++;
                } else {
                    endpointId = null;
                    break;
                }
            }
            if (endpointId == null) {
                return EndpointId.ENDPOINT_A1;
            }
            return endpointId;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EndpointId[] $values() {
        return new EndpointId[]{ENDPOINT_SPIKY, ENDPOINT_A1, ENDPOINT_HELLO, ENDPOINT_DEFINE_VARS};
    }

    static {
        EndpointId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC2708l7.bravo($values);
        INSTANCE = new Companion(null);
    }

    private EndpointId(String str, int i4, String str2) {
        this.identifier = str2;
    }

    @NotNull
    public static final EndpointId fromEventGroup(@NotNull EventGroup eventGroup) {
        return INSTANCE.fromEventGroup(eventGroup);
    }

    @NotNull
    public static final EndpointId fromString(@NotNull String str) {
        return INSTANCE.fromString(str);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static EndpointId valueOf(String str) {
        return (EndpointId) Enum.valueOf(EndpointId.class, str);
    }

    public static EndpointId[] values() {
        return (EndpointId[]) $VALUES.clone();
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
