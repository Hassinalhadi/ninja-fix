package com.app.network.network.models;

import android.content.Context;
import androidx.appcompat.widget.P0;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2769s6;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010x\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u0005J\u0006\u0010z\u001a\u00020\u0005J\u0006\u0010{\u001a\u000206J\u0006\u0010|\u001a\u000206J\b\u0010}\u001a\u0004\u0018\u00010~J\f\u0010j\u001a\u0004\u0018\u00010\\*\u00020\u0000J\n\u0010\u007f\u001a\u00020\u0005*\u00020\u0000J\u0015\u0010\u0080\u0001\u001a\u00020\u0005*\u00020\\2\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001J\u0011\u0010\u0083\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010<\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b=\u0010\r\"\u0004\b>\u0010\u000fR\u001a\u0010?\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010D\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\bE\u0010*\"\u0004\bF\u0010,R\"\u0010G\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010 R\u001c\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010W\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\tR\"\u0010Z\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u001e\"\u0004\b^\u0010 R\u001c\u0010_\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0007\"\u0004\ba\u0010\tR\"\u0010b\u001a\n\u0012\u0004\u0012\u00020c\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u001e\"\u0004\be\u0010 R\u001e\u0010f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bg\u0010\r\"\u0004\bh\u0010\u000fR\u001e\u0010i\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bj\u0010\r\"\u0004\bk\u0010\u000fR\u001e\u0010l\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\bm\u0010\r\"\u0004\bn\u0010\u000fR\u001e\u0010o\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\bo\u00108\"\u0004\bp\u0010:R\u001e\u0010q\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\bq\u00108\"\u0004\br\u0010:R\u001e\u0010s\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\bs\u00108\"\u0004\bt\u0010:R\u001e\u0010u\u001a\u0004\u0018\u00010\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0007\"\u0004\bw\u0010\t¨\u0006\u0086\u0001"}, d2 = {"Lcom/app/network/network/models/Order;", "Ljava/io/Serializable;", "<init>", "()V", "tripId", "", "getTripId", "()Ljava/lang/String;", "setTripId", "(Ljava/lang/String;)V", "allocationWindowId", "", "getAllocationWindowId", "()Ljava/lang/Integer;", "setAllocationWindowId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "allocationWindow", "Lcom/app/network/network/models/AllocationWindow;", "getAllocationWindow", "()Lcom/app/network/network/models/AllocationWindow;", "setAllocationWindow", "(Lcom/app/network/network/models/AllocationWindow;)V", "backendId", "getBackendId", "setBackendId", "currentLanguageMetaData", "", "Lcom/app/network/network/models/LanguageMetaData;", "getCurrentLanguageMetaData", "()Ljava/util/List;", "setCurrentLanguageMetaData", "(Ljava/util/List;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "earnings", "", "getEarnings", "()Ljava/lang/Float;", "setEarnings", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "distanceInKm", "", "getDistanceInKm", "()Ljava/lang/Double;", "setDistanceInKm", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "deliveryTaskConfirmationImageRequired", "", "getDeliveryTaskConfirmationImageRequired", "()Ljava/lang/Boolean;", "setDeliveryTaskConfirmationImageRequired", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", Constants.KEY_ID, "getId", "setId", "enableAttendanceForReturnToAreaTask", "getEnableAttendanceForReturnToAreaTask", "()Z", "setEnableAttendanceForReturnToAreaTask", "(Z)V", "actualEarnings", "getActualEarnings", "setActualEarnings", "metaData", "Lcom/app/network/network/models/OrderMetaData;", "getMetaData", "setMetaData", "platform", "Lcom/app/network/network/models/Platform;", "getPlatform", "()Lcom/app/network/network/models/Platform;", "setPlatform", "(Lcom/app/network/network/models/Platform;)V", "paymentType", "Lcom/app/network/network/models/PaymentType;", "getPaymentType", "()Lcom/app/network/network/models/PaymentType;", "setPaymentType", "(Lcom/app/network/network/models/PaymentType;)V", "status", "getStatus", "setStatus", "tasks", "", "Lcom/app/network/network/models/OrderTask;", "getTasks", "setTasks", "chatUrl", "getChatUrl", "setChatUrl", "assets", "Lcom/app/network/network/models/OrderAsset;", "getAssets", "setAssets", "totalTasks", "getTotalTasks", "setTotalTasks", "currentTask", "getCurrentTask", "setCurrentTask", "remainingTimeInSeconds", "getRemainingTimeInSeconds", "setRemainingTimeInSeconds", "isStacked", "setStacked", "isOnDemand", "setOnDemand", "isHybrid", "setHybrid", "backendNo", "getBackendNo", "setBackendNo", "assignLocalizedMetaData", "languageCode", "getOrderToName", "shouldShowOrderTo", "isReturnable", "getOrderStatusEnum", "Lcom/app/network/network/models/OrderStatus;", "getStepText", "getTaskTitle", "context", "Landroid/content/Context;", "mergeFrom", "", "apiOrder", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Order implements Serializable {

    @Nullable
    private Float actualEarnings;

    @Nullable
    private AllocationWindow allocationWindow;

    @Nullable
    private Integer allocationWindowId;

    @Nullable
    private List<OrderAsset> assets;

    @Nullable
    private String backendId;

    @Nullable
    private String backendNo;

    @Nullable
    private String chatUrl;

    @Nullable
    private Date createdAt;

    @Nullable
    private List<LanguageMetaData> currentLanguageMetaData;

    @Nullable
    private Integer currentTask;

    @Nullable
    private Boolean deliveryTaskConfirmationImageRequired;

    @Nullable
    private Double distanceInKm;

    @Nullable
    private Float earnings;
    private boolean enableAttendanceForReturnToAreaTask;

    @Nullable
    private Integer id;

    @Nullable
    private Boolean isHybrid;

    @Nullable
    private Boolean isOnDemand;

    @Nullable
    private Boolean isStacked;

    @Nullable
    private List<OrderMetaData> metaData;

    @Nullable
    private PaymentType paymentType;

    @Nullable
    private Platform platform;

    @Nullable
    private Integer remainingTimeInSeconds;

    @Nullable
    private String status;

    @Nullable
    private List<OrderTask> tasks;

    @Nullable
    private Integer totalTasks;

    @Nullable
    private String tripId;

    @NotNull
    public final Order assignLocalizedMetaData(@NotNull String languageCode) {
        List<OrderMetaData> list;
        List<OrderTask> list2;
        ArrayList arrayList;
        String str;
        LanguageMetaData languageMetaData;
        List list3;
        Intrinsics.echo(languageCode, "languageCode");
        List<LanguageMetaData> list4 = this.currentLanguageMetaData;
        if (list4 != null && (list = this.metaData) != null && !list.isEmpty() && (list2 = this.tasks) != null && !list2.isEmpty()) {
            List<OrderMetaData> list5 = this.metaData;
            if (list5 != null) {
                arrayList = new ArrayList();
                for (Object obj : list5) {
                    if (Intrinsics.areEqual(((OrderMetaData) obj).getLanguageCode(), languageCode)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            this.metaData = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list4) {
                String taskId = ((LanguageMetaData) obj2).getTaskId();
                Object obj3 = linkedHashMap.get(taskId);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(taskId, obj3);
                }
                ((List) obj3).add(obj2);
            }
            List<OrderTask> list6 = this.tasks;
            if (list6 != null) {
                for (OrderTask orderTask : list6) {
                    Integer id2 = orderTask.getId();
                    if (id2 != null) {
                        str = id2.toString();
                    } else {
                        str = null;
                    }
                    if (str != null && (list3 = (List) linkedHashMap.get(str)) != null) {
                        languageMetaData = (LanguageMetaData) CollectionsKt.green(list3);
                    } else {
                        languageMetaData = null;
                    }
                    if (languageMetaData != null) {
                        orderTask.setMetaData(languageMetaData);
                    }
                }
            }
        }
        return this;
    }

    @Nullable
    public final Float getActualEarnings() {
        return this.actualEarnings;
    }

    @Nullable
    public final AllocationWindow getAllocationWindow() {
        return this.allocationWindow;
    }

    @Nullable
    public final Integer getAllocationWindowId() {
        return this.allocationWindowId;
    }

    @Nullable
    public final List<OrderAsset> getAssets() {
        return this.assets;
    }

    @Nullable
    public final String getBackendId() {
        return this.backendId;
    }

    @Nullable
    public final String getBackendNo() {
        String str = this.backendId;
        if (str != null) {
            return r.oscar(str, "#", "");
        }
        return null;
    }

    @Nullable
    public final String getChatUrl() {
        return this.chatUrl;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final List<LanguageMetaData> getCurrentLanguageMetaData() {
        return this.currentLanguageMetaData;
    }

    @Nullable
    public final Integer getCurrentTask() {
        return this.currentTask;
    }

    @Nullable
    public final Boolean getDeliveryTaskConfirmationImageRequired() {
        return this.deliveryTaskConfirmationImageRequired;
    }

    @Nullable
    public final Double getDistanceInKm() {
        return this.distanceInKm;
    }

    @Nullable
    public final Float getEarnings() {
        return this.earnings;
    }

    public final boolean getEnableAttendanceForReturnToAreaTask() {
        return this.enableAttendanceForReturnToAreaTask;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final List<OrderMetaData> getMetaData() {
        return this.metaData;
    }

    @Nullable
    public final OrderStatus getOrderStatusEnum() {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (Intrinsics.areEqual(orderStatus.name(), this.status)) {
                return orderStatus;
            }
        }
        return null;
    }

    @NotNull
    public final String getOrderToName() {
        Object obj;
        OrderAddress address;
        String description;
        List<OrderTask> list = this.tasks;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((OrderTask) obj).getTaskType() == TaskType.DELIVERY) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            OrderTask orderTask = (OrderTask) obj;
            if (orderTask != null && (address = orderTask.getAddress()) != null && (description = address.getDescription()) != null) {
                return description;
            }
            return "";
        }
        return "";
    }

    @Nullable
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final Platform getPlatform() {
        return this.platform;
    }

    @Nullable
    public final Integer getRemainingTimeInSeconds() {
        return this.remainingTimeInSeconds;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStepText(@NotNull Order order) {
        int i4;
        List p4;
        Intrinsics.echo(order, "<this>");
        List<OrderTask> list = order.tasks;
        int i5 = 0;
        if (list != null) {
            i4 = list.size();
        } else {
            i4 = 0;
        }
        List<OrderTask> list2 = order.tasks;
        if (list2 != null && (p4 = CollectionsKt.p(list2, new Comparator() { // from class: com.app.network.network.models.Order$getStepText$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                int i10;
                Integer rank = ((OrderTask) t5).getRank();
                int i11 = LottieConstants.IterateForever;
                if (rank != null) {
                    i10 = rank.intValue();
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i10);
                Integer rank2 = ((OrderTask) t10).getRank();
                if (rank2 != null) {
                    i11 = rank2.intValue();
                }
                return AbstractC2769s6.bravo(valueOf, Integer.valueOf(i11));
            }
        })) != null) {
            Iterator it = p4.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((OrderTask) it.next()).getTaskStatus() != TaskStatus.COMPLETED) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i10);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                i5 = valueOf.intValue();
            }
        }
        return P0.azure(i5 + 1, i4, "(", "/", ")");
    }

    @NotNull
    public final String getTaskTitle(@NotNull OrderTask orderTask, @NotNull Context context) {
        String string;
        Intrinsics.echo(orderTask, "<this>");
        Intrinsics.echo(context, "context");
        TaskType taskType = orderTask.getTaskType();
        if (taskType != null && (string = context.getString(taskType.getStringRes())) != null) {
            return string;
        }
        return "";
    }

    @Nullable
    public final List<OrderTask> getTasks() {
        return this.tasks;
    }

    @Nullable
    public final Integer getTotalTasks() {
        return this.totalTasks;
    }

    @Nullable
    public final String getTripId() {
        return this.tripId;
    }

    @Nullable
    /* renamed from: isHybrid, reason: from getter */
    public final Boolean getIsHybrid() {
        return this.isHybrid;
    }

    @Nullable
    /* renamed from: isOnDemand, reason: from getter */
    public final Boolean getIsOnDemand() {
        return this.isOnDemand;
    }

    public final boolean isReturnable() {
        return Intrinsics.areEqual(this.status, "RETURNING");
    }

    @Nullable
    /* renamed from: isStacked, reason: from getter */
    public final Boolean getIsStacked() {
        return this.isStacked;
    }

    public final void mergeFrom(@NotNull Order apiOrder) {
        Intrinsics.echo(apiOrder, "apiOrder");
        this.allocationWindowId = apiOrder.allocationWindowId;
        this.isStacked = apiOrder.isStacked;
        this.isHybrid = apiOrder.isHybrid;
        this.allocationWindow = apiOrder.allocationWindow;
        this.backendId = apiOrder.backendId;
        this.currentLanguageMetaData = apiOrder.currentLanguageMetaData;
        this.createdAt = apiOrder.createdAt;
        this.distanceInKm = apiOrder.distanceInKm;
        this.deliveryTaskConfirmationImageRequired = apiOrder.deliveryTaskConfirmationImageRequired;
        this.enableAttendanceForReturnToAreaTask = apiOrder.enableAttendanceForReturnToAreaTask;
        this.metaData = apiOrder.metaData;
        this.platform = apiOrder.platform;
        this.paymentType = apiOrder.paymentType;
        this.status = apiOrder.status;
        this.tasks = apiOrder.tasks;
        this.chatUrl = apiOrder.chatUrl;
        this.assets = apiOrder.assets;
        this.totalTasks = apiOrder.totalTasks;
        this.currentTask = apiOrder.currentTask;
        this.remainingTimeInSeconds = apiOrder.remainingTimeInSeconds;
        this.tripId = apiOrder.tripId;
    }

    public final void setActualEarnings(@Nullable Float f5) {
        this.actualEarnings = f5;
    }

    public final void setAllocationWindow(@Nullable AllocationWindow allocationWindow) {
        this.allocationWindow = allocationWindow;
    }

    public final void setAllocationWindowId(@Nullable Integer num) {
        this.allocationWindowId = num;
    }

    public final void setAssets(@Nullable List<OrderAsset> list) {
        this.assets = list;
    }

    public final void setBackendId(@Nullable String str) {
        this.backendId = str;
    }

    public final void setBackendNo(@Nullable String str) {
        this.backendNo = str;
    }

    public final void setChatUrl(@Nullable String str) {
        this.chatUrl = str;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setCurrentLanguageMetaData(@Nullable List<LanguageMetaData> list) {
        this.currentLanguageMetaData = list;
    }

    public final void setCurrentTask(@Nullable Integer num) {
        this.currentTask = num;
    }

    public final void setDeliveryTaskConfirmationImageRequired(@Nullable Boolean bool) {
        this.deliveryTaskConfirmationImageRequired = bool;
    }

    public final void setDistanceInKm(@Nullable Double d4) {
        this.distanceInKm = d4;
    }

    public final void setEarnings(@Nullable Float f5) {
        this.earnings = f5;
    }

    public final void setEnableAttendanceForReturnToAreaTask(boolean z2) {
        this.enableAttendanceForReturnToAreaTask = z2;
    }

    public final void setHybrid(@Nullable Boolean bool) {
        this.isHybrid = bool;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setMetaData(@Nullable List<OrderMetaData> list) {
        this.metaData = list;
    }

    public final void setOnDemand(@Nullable Boolean bool) {
        this.isOnDemand = bool;
    }

    public final void setPaymentType(@Nullable PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public final void setPlatform(@Nullable Platform platform) {
        this.platform = platform;
    }

    public final void setRemainingTimeInSeconds(@Nullable Integer num) {
        this.remainingTimeInSeconds = num;
    }

    public final void setStacked(@Nullable Boolean bool) {
        this.isStacked = bool;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setTasks(@Nullable List<OrderTask> list) {
        this.tasks = list;
    }

    public final void setTotalTasks(@Nullable Integer num) {
        this.totalTasks = num;
    }

    public final void setTripId(@Nullable String str) {
        this.tripId = str;
    }

    public final boolean shouldShowOrderTo() {
        List<OrderTask> list = this.tasks;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((OrderTask) next).getTaskType() == TaskType.DELIVERY) {
                    obj = next;
                    break;
                }
            }
            obj = (OrderTask) obj;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final OrderTask getCurrentTask(@NotNull Order order) {
        List p4;
        Intrinsics.echo(order, "<this>");
        List<OrderTask> list = order.tasks;
        Object obj = null;
        if (list == null || (p4 = CollectionsKt.p(list, new Comparator() { // from class: com.app.network.network.models.Order$getCurrentTask$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                int i4;
                Integer rank = ((OrderTask) t5).getRank();
                int i5 = LottieConstants.IterateForever;
                if (rank != null) {
                    i4 = rank.intValue();
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                Integer valueOf = Integer.valueOf(i4);
                Integer rank2 = ((OrderTask) t10).getRank();
                if (rank2 != null) {
                    i5 = rank2.intValue();
                }
                return AbstractC2769s6.bravo(valueOf, Integer.valueOf(i5));
            }
        })) == null) {
            return null;
        }
        Iterator it = p4.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((OrderTask) next).getTaskStatus() != TaskStatus.COMPLETED) {
                obj = next;
                break;
            }
        }
        return (OrderTask) obj;
    }
}
