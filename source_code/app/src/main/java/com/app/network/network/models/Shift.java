package com.app.network.network.models;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001:\u0002OPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010G\u001a\u00020\fJ\u0006\u0010J\u001a\u00020\fJ\u0006\u0010K\u001a\u00020\u001eJ\u0006\u0010L\u001a\u00020\fJ\u0006\u0010M\u001a\u00020\fJ\u0006\u0010N\u001a\u00020\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\"\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000e\"\u0004\b<\u0010\u0010R\u001a\u0010=\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0011\u0010H\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\bI\u0010?¨\u0006Q"}, d2 = {"Lcom/app/network/network/models/Shift;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "startAt", "", "getStartAt", "()Ljava/lang/String;", "setStartAt", "(Ljava/lang/String;)V", "finishAt", "getFinishAt", "setFinishAt", "status", "getStatus", "setStatus", "dayOfWeek", "getDayOfWeek", "setDayOfWeek", Constants.KEY_TYPE, "getType", "setType", "canLeave", "", "getCanLeave", "()Ljava/lang/Boolean;", "setCanLeave", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "branch", "Lcom/app/network/network/models/Shift$Branch;", "getBranch", "()Lcom/app/network/network/models/Shift$Branch;", "setBranch", "(Lcom/app/network/network/models/Shift$Branch;)V", "zone", "Lcom/app/network/network/models/Zone;", "getZone", "()Lcom/app/network/network/models/Zone;", "setZone", "(Lcom/app/network/network/models/Zone;)V", "areaType", "getAreaType", "setAreaType", "pricingRules", "", "Lcom/app/network/network/models/Shift$PricingRule;", "getPricingRules", "()Ljava/util/List;", "setPricingRules", "(Ljava/util/List;)V", "reasonLeaveSelected", "getReasonLeaveSelected", "setReasonLeaveSelected", "canTakeBreak", "getCanTakeBreak", "()Z", "setCanTakeBreak", "(Z)V", "remainingBreakMillis", "getRemainingBreakMillis", "()J", "setRemainingBreakMillis", "(J)V", "readableStatus", "onBreak", "getOnBreak", "readablePricingRules", "hasPredictions", "readablePricingRulesInfo", "get12HourFormatStartAt", "get12HourFormatFinishAt", "Branch", "PricingRule", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Shift implements Serializable {

    @Nullable
    private String areaType;

    @Nullable
    private Branch branch;

    @Nullable
    private Boolean canLeave;
    private boolean canTakeBreak;

    @Nullable
    private String dayOfWeek;

    @Nullable
    private String finishAt;

    @Nullable
    private Long id;

    @Nullable
    private List<PricingRule> pricingRules;

    @NotNull
    private String reasonLeaveSelected = "";
    private long remainingBreakMillis;

    @Nullable
    private String startAt;

    @Nullable
    private String status;

    @Nullable
    private String type;

    @Nullable
    private Zone zone;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/Shift$Branch;", "Ljava/io/Serializable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "latitude", "getLatitude", "setLatitude", "longitude", "getLongitude", "setLongitude", Constants.KEY_ID, "", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Branch implements Serializable {

        @Nullable
        private Long id;

        @Nullable
        private String latitude;

        @Nullable
        private String longitude;

        @Nullable
        private String name;

        @Nullable
        public final Long getId() {
            return this.id;
        }

        @Nullable
        public final String getLatitude() {
            return this.latitude;
        }

        @Nullable
        public final String getLongitude() {
            return this.longitude;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final void setId(@Nullable Long l10) {
            this.id = l10;
        }

        public final void setLatitude(@Nullable String str) {
            this.latitude = str;
        }

        public final void setLongitude(@Nullable String str) {
            this.longitude = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.¨\u00064"}, d2 = {"Lcom/app/network/network/models/Shift$PricingRule;", "Ljava/io/Serializable;", "<init>", "()V", "amount", "", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "displayableAmount", "getDisplayableAmount", "setDisplayableAmount", Constants.KEY_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "prediction", "getPrediction", "setPrediction", "predictionAr", "getPredictionAr", "setPredictionAr", "messageKey", "getMessageKey", "setMessageKey", "isVisibleToCaptain", "", "()Ljava/lang/Boolean;", "setVisibleToCaptain", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "category", "getCategory", "setCategory", "categoryColor", "getCategoryColor", "setCategoryColor", "preconditionMessages", "", "getPreconditionMessages", "()Ljava/util/List;", "setPreconditionMessages", "(Ljava/util/List;)V", "capabilities", "Lcom/app/network/network/models/Shift$PricingRule$Capability;", "getCapabilities", "setCapabilities", "Capability", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class PricingRule implements Serializable {

        @Nullable
        private Double amount;

        @Nullable
        private List<Capability> capabilities;

        @Nullable
        private String category;

        @Nullable
        private String categoryColor;

        @Nullable
        private Double displayableAmount;

        @Nullable
        private Boolean isVisibleToCaptain;

        @Nullable
        private String message;

        @Nullable
        private String messageKey;

        @Nullable
        private List<String> preconditionMessages;

        @Nullable
        private String prediction;

        @Nullable
        private String predictionAr;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/Shift$PricingRule$Capability;", "Ljava/io/Serializable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Capability implements Serializable {

            @Nullable
            private Integer id;

            @Nullable
            private String name;

            @Nullable
            public final Integer getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public final void setId(@Nullable Integer num) {
                this.id = num;
            }

            public final void setName(@Nullable String str) {
                this.name = str;
            }
        }

        @Nullable
        public final Double getAmount() {
            return this.amount;
        }

        @Nullable
        public final List<Capability> getCapabilities() {
            return this.capabilities;
        }

        @Nullable
        public final String getCategory() {
            return this.category;
        }

        @Nullable
        public final String getCategoryColor() {
            return this.categoryColor;
        }

        @Nullable
        public final Double getDisplayableAmount() {
            return this.displayableAmount;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        public final String getMessageKey() {
            return this.messageKey;
        }

        @Nullable
        public final List<String> getPreconditionMessages() {
            return this.preconditionMessages;
        }

        @Nullable
        public final String getPrediction() {
            return this.prediction;
        }

        @Nullable
        public final String getPredictionAr() {
            return this.predictionAr;
        }

        @Nullable
        /* renamed from: isVisibleToCaptain, reason: from getter */
        public final Boolean getIsVisibleToCaptain() {
            return this.isVisibleToCaptain;
        }

        public final void setAmount(@Nullable Double d4) {
            this.amount = d4;
        }

        public final void setCapabilities(@Nullable List<Capability> list) {
            this.capabilities = list;
        }

        public final void setCategory(@Nullable String str) {
            this.category = str;
        }

        public final void setCategoryColor(@Nullable String str) {
            this.categoryColor = str;
        }

        public final void setDisplayableAmount(@Nullable Double d4) {
            this.displayableAmount = d4;
        }

        public final void setMessage(@Nullable String str) {
            this.message = str;
        }

        public final void setMessageKey(@Nullable String str) {
            this.messageKey = str;
        }

        public final void setPreconditionMessages(@Nullable List<String> list) {
            this.preconditionMessages = list;
        }

        public final void setPrediction(@Nullable String str) {
            this.prediction = str;
        }

        public final void setPredictionAr(@Nullable String str) {
            this.predictionAr = str;
        }

        public final void setVisibleToCaptain(@Nullable Boolean bool) {
            this.isVisibleToCaptain = bool;
        }
    }

    @NotNull
    public final String get12HourFormatFinishAt() {
        Date parse = new SimpleDateFormat("HH:mm:ss").parse(this.finishAt);
        Intrinsics.delta(parse, "parse(...)");
        String format = new SimpleDateFormat("hh:mm a").format(parse);
        Intrinsics.delta(format, "format(...)");
        return format;
    }

    @NotNull
    public final String get12HourFormatStartAt() {
        Date parse = new SimpleDateFormat("HH:mm:ss").parse(this.startAt);
        Intrinsics.delta(parse, "parse(...)");
        String format = new SimpleDateFormat("hh:mm a").format(parse);
        Intrinsics.delta(format, "format(...)");
        return format;
    }

    @Nullable
    public final String getAreaType() {
        return this.areaType;
    }

    @Nullable
    public final Branch getBranch() {
        return this.branch;
    }

    @Nullable
    public final Boolean getCanLeave() {
        return this.canLeave;
    }

    public final boolean getCanTakeBreak() {
        return this.canTakeBreak;
    }

    @Nullable
    public final String getDayOfWeek() {
        return this.dayOfWeek;
    }

    @Nullable
    public final String getFinishAt() {
        return this.finishAt;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    public final boolean getOnBreak() {
        if (this.remainingBreakMillis > 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final List<PricingRule> getPricingRules() {
        return this.pricingRules;
    }

    @NotNull
    public final String getReasonLeaveSelected() {
        return this.reasonLeaveSelected;
    }

    public final long getRemainingBreakMillis() {
        return this.remainingBreakMillis;
    }

    @Nullable
    public final String getStartAt() {
        return this.startAt;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Zone getZone() {
        return this.zone;
    }

    public final boolean hasPredictions() {
        boolean z2;
        String prediction;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.delta(language, "getLanguage(...)");
        boolean quebec = r.quebec(language, "ar", true);
        List<PricingRule> list = this.pricingRules;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (list != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !list.isEmpty()) {
            for (PricingRule pricingRule : list) {
                if (quebec) {
                    prediction = pricingRule.getPredictionAr();
                } else {
                    prediction = pricingRule.getPrediction();
                }
                if (prediction != null && !StringsKt.gray(prediction)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String readablePricingRules() {
        String prediction;
        String language = Locale.getDefault().getLanguage();
        Intrinsics.delta(language, "getLanguage(...)");
        boolean quebec = r.quebec(language, "ar", true);
        StringBuilder sb2 = new StringBuilder();
        List<PricingRule> list = this.pricingRules;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        for (PricingRule pricingRule : list) {
            if (quebec) {
                prediction = pricingRule.getPredictionAr();
            } else {
                prediction = pricingRule.getPrediction();
            }
            if (prediction != null && !StringsKt.gray(prediction)) {
                sb2.append(prediction);
                sb2.append('\n');
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return StringsKt.d(sb3).toString();
    }

    @NotNull
    public final String readablePricingRulesInfo() {
        List list = this.pricingRules;
        if (list == null) {
            list = new ArrayList();
        }
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = ad.amber(str, ((PricingRule) it.next()).getMessage(), "\n");
        }
        return str;
    }

    @NotNull
    public final String readableStatus() {
        if (Intrinsics.areEqual(this.status, "CURRENTLY_ACTIVE")) {
            return "🟢";
        }
        return "🔴";
    }

    public final void setAreaType(@Nullable String str) {
        this.areaType = str;
    }

    public final void setBranch(@Nullable Branch branch) {
        this.branch = branch;
    }

    public final void setCanLeave(@Nullable Boolean bool) {
        this.canLeave = bool;
    }

    public final void setCanTakeBreak(boolean z2) {
        this.canTakeBreak = z2;
    }

    public final void setDayOfWeek(@Nullable String str) {
        this.dayOfWeek = str;
    }

    public final void setFinishAt(@Nullable String str) {
        this.finishAt = str;
    }

    public final void setId(@Nullable Long l10) {
        this.id = l10;
    }

    public final void setPricingRules(@Nullable List<PricingRule> list) {
        this.pricingRules = list;
    }

    public final void setReasonLeaveSelected(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.reasonLeaveSelected = str;
    }

    public final void setRemainingBreakMillis(long j5) {
        this.remainingBreakMillis = j5;
    }

    public final void setStartAt(@Nullable String str) {
        this.startAt = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setZone(@Nullable Zone zone) {
        this.zone = zone;
    }
}
