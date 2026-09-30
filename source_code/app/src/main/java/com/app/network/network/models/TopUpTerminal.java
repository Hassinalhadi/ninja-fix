package com.app.network.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TopUpTerminal;", "", "<init>", "()V", "SUCCESS", "FAILED", "DECLINED", "TIMEOUT", "Lcom/app/network/network/models/TopUpTerminal$DECLINED;", "Lcom/app/network/network/models/TopUpTerminal$FAILED;", "Lcom/app/network/network/models/TopUpTerminal$SUCCESS;", "Lcom/app/network/network/models/TopUpTerminal$TIMEOUT;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TopUpTerminal {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TopUpTerminal$DECLINED;", "Lcom/app/network/network/models/TopUpTerminal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class DECLINED extends TopUpTerminal {

        @NotNull
        public static final DECLINED INSTANCE = new DECLINED();

        private DECLINED() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DECLINED);
        }

        public int hashCode() {
            return -1259927846;
        }

        @NotNull
        public String toString() {
            return "DECLINED";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TopUpTerminal$FAILED;", "Lcom/app/network/network/models/TopUpTerminal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class FAILED extends TopUpTerminal {

        @NotNull
        public static final FAILED INSTANCE = new FAILED();

        private FAILED() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FAILED);
        }

        public int hashCode() {
            return 950754793;
        }

        @NotNull
        public String toString() {
            return "FAILED";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TopUpTerminal$SUCCESS;", "Lcom/app/network/network/models/TopUpTerminal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class SUCCESS extends TopUpTerminal {

        @NotNull
        public static final SUCCESS INSTANCE = new SUCCESS();

        private SUCCESS() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof SUCCESS);
        }

        public int hashCode() {
            return -1371952201;
        }

        @NotNull
        public String toString() {
            return "SUCCESS";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/TopUpTerminal$TIMEOUT;", "Lcom/app/network/network/models/TopUpTerminal;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class TIMEOUT extends TopUpTerminal {

        @NotNull
        public static final TIMEOUT INSTANCE = new TIMEOUT();

        private TIMEOUT() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof TIMEOUT);
        }

        public int hashCode() {
            return -818693867;
        }

        @NotNull
        public String toString() {
            return "TIMEOUT";
        }
    }

    public /* synthetic */ TopUpTerminal(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TopUpTerminal() {
    }
}
