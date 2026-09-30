package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0007\u0010´\u0001\u001a\u00020\fJ\u000b\u0010µ\u0001\u001a\u00020-*\u00020\u0000J\u0007\u0010¶\u0001\u001a\u00020\fJ\u0012\u0010·\u0001\u001a\u00020-2\t\b\u0002\u0010¸\u0001\u001a\u00020-J\u0007\u0010¹\u0001\u001a\u00020-J\u0012\u0010º\u0001\u001a\u00020-2\t\b\u0002\u0010¸\u0001\u001a\u00020-J\u0012\u0010»\u0001\u001a\u00020-2\t\b\u0002\u0010¸\u0001\u001a\u00020-J\u0012\u0010¼\u0001\u001a\u00020-2\t\b\u0002\u0010¸\u0001\u001a\u00020-J\u0007\u0010½\u0001\u001a\u00020-J\u0007\u0010¾\u0001\u001a\u00020-J\u0012\u0010¿\u0001\u001a\u00020-2\u0007\u0010¸\u0001\u001a\u00020-H\u0002R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001e\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R\u001c\u0010&\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R\u001e\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001e\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00103\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010C\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001a\n\u0012\u0004\u0012\u00020N\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010S\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR\u001c\u0010V\u001a\u0004\u0018\u00010WX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010]X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010P\"\u0004\b_\u0010RR\"\u0010`\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010P\"\u0004\bc\u0010RR\u001e\u0010d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\be\u0010\u0007\"\u0004\bf\u0010\tR\u001e\u0010g\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bh\u0010\u0007\"\u0004\bi\u0010\tR\u001c\u0010j\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u000e\"\u0004\bl\u0010\u0010R\u001e\u0010m\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bn\u0010\u0007\"\u0004\bo\u0010\tR\u001c\u0010p\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u000e\"\u0004\br\u0010\u0010R\u001c\u0010s\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u000e\"\u0004\bu\u0010\u0010R\u001e\u0010v\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bw\u0010\u0007\"\u0004\bx\u0010\tR\u001e\u0010y\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\bz\u0010\u0007\"\u0004\b{\u0010\tR\u001e\u0010|\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b}\u0010/\"\u0004\b~\u00101R \u0010\u007f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0012\n\u0002\u0010\n\u001a\u0005\b\u0080\u0001\u0010\u0007\"\u0005\b\u0081\u0001\u0010\tR!\u0010\u0082\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b\u0083\u0001\u0010/\"\u0005\b\u0084\u0001\u00101R!\u0010\u0085\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b\u0086\u0001\u0010/\"\u0005\b\u0087\u0001\u00101R&\u0010\u0088\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010MX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010P\"\u0005\b\u008b\u0001\u0010RR\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\"\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u0097\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0098\u0001\u0018\u00010MX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010P\"\u0005\b\u009a\u0001\u0010RR&\u0010\u009b\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010MX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010P\"\u0005\b\u009e\u0001\u0010RR&\u0010\u009f\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010MX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010P\"\u0005\b¡\u0001\u0010RR!\u0010¢\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b£\u0001\u0010/\"\u0005\b¤\u0001\u00101R!\u0010¥\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b¦\u0001\u0010/\"\u0005\b§\u0001\u00101R!\u0010¨\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b©\u0001\u0010/\"\u0005\bª\u0001\u00101R!\u0010«\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b¬\u0001\u0010/\"\u0005\b\u00ad\u0001\u00101R!\u0010®\u0001\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0012\n\u0002\u00102\u001a\u0005\b¯\u0001\u0010/\"\u0005\b°\u0001\u00101R\u001f\u0010±\u0001\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u000e\"\u0005\b³\u0001\u0010\u0010¨\u0006À\u0001"}, d2 = {"Lcom/app/network/network/models/OrderTask;", "Ljava/io/Serializable;", "<init>", "()V", "orderId", "", "getOrderId", "()Ljava/lang/Integer;", "setOrderId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "warningText", "", "getWarningText", "()Ljava/lang/String;", "setWarningText", "(Ljava/lang/String;)V", "completedAt", "Ljava/util/Date;", "getCompletedAt", "()Ljava/util/Date;", "setCompletedAt", "(Ljava/util/Date;)V", "taskStatus", "Lcom/app/network/network/models/TaskStatus;", "getTaskStatus", "()Lcom/app/network/network/models/TaskStatus;", "setTaskStatus", "(Lcom/app/network/network/models/TaskStatus;)V", "description", "getDescription", "setDescription", "rank", "getRank", "setRank", "createdAt", "getCreatedAt", "setCreatedAt", "startedAt", "getStartedAt", "setStartedAt", "distanceInMeters", "getDistanceInMeters", "setDistanceInMeters", "showPaymentType", "", "getShowPaymentType", "()Ljava/lang/Boolean;", "setShowPaymentType", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "image", "getImage", "setImage", "taskType", "Lcom/app/network/network/models/TaskType;", "getTaskType", "()Lcom/app/network/network/models/TaskType;", "setTaskType", "(Lcom/app/network/network/models/TaskType;)V", "payAtPickup", "", "getPayAtPickup", "()Ljava/lang/Float;", "setPayAtPickup", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "collectAtDelivery", "getCollectAtDelivery", "setCollectAtDelivery", "address", "Lcom/app/network/network/models/OrderAddress;", "getAddress", "()Lcom/app/network/network/models/OrderAddress;", "setAddress", "(Lcom/app/network/network/models/OrderAddress;)V", "tags", "", "Lcom/app/network/network/models/TagDto;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "etaInSeconds", "getEtaInSeconds", "setEtaInSeconds", "receipt", "Lcom/app/network/network/models/Receipt;", "getReceipt", "()Lcom/app/network/network/models/Receipt;", "setReceipt", "(Lcom/app/network/network/models/Receipt;)V", "deliveryProofImages", "", "getDeliveryProofImages", "setDeliveryProofImages", "items", "Lcom/app/network/network/models/Item;", "getItems", "setItems", "remainingHandShakeSeconds", "getRemainingHandShakeSeconds", "setRemainingHandShakeSeconds", "remainingAddressNoteInputSeconds", "getRemainingAddressNoteInputSeconds", "setRemainingAddressNoteInputSeconds", "name", "getName", "setName", Constants.KEY_ID, "getId", "setId", "localizedDescription", "getLocalizedDescription", "setLocalizedDescription", "orderDisplayId", "getOrderDisplayId", "setOrderDisplayId", "estimatedCompletionSeconds", "getEstimatedCompletionSeconds", "setEstimatedCompletionSeconds", "actualCompletionSeconds", "getActualCompletionSeconds", "setActualCompletionSeconds", "deliveryConfirmationCodeRequired", "getDeliveryConfirmationCodeRequired", "setDeliveryConfirmationCodeRequired", "deliveryConfirmationCodeLength", "getDeliveryConfirmationCodeLength", "setDeliveryConfirmationCodeLength", "canAddAddressNote", "getCanAddAddressNote", "setCanAddAddressNote", "returnableItemsRequired", "getReturnableItemsRequired", "setReturnableItemsRequired", "allAddressNotes", "Lcom/app/network/network/models/AddressNoteListItem;", "getAllAddressNotes", "setAllAddressNotes", "firstAddressNote", "getFirstAddressNote", "()Lcom/app/network/network/models/AddressNoteListItem;", "setFirstAddressNote", "(Lcom/app/network/network/models/AddressNoteListItem;)V", "metaData", "Lcom/app/network/network/models/LanguageMetaData;", "getMetaData", "()Lcom/app/network/network/models/LanguageMetaData;", "setMetaData", "(Lcom/app/network/network/models/LanguageMetaData;)V", "handshakeItemGroups", "Lcom/app/network/network/models/HandshakeItemGroup;", "getHandshakeItemGroups", "setHandshakeItemGroups", "handshakeItems", "Lcom/app/network/network/models/HandshakeItem;", "getHandshakeItems", "setHandshakeItems", "appendages", "getAppendages", "setAppendages", "requiresQrScan", "getRequiresQrScan", "setRequiresQrScan", "eligibleForSupport", "getEligibleForSupport", "setEligibleForSupport", "requiresInvoice", "getRequiresInvoice", "setRequiresInvoice", "requiresInvoiceQrCode", "getRequiresInvoiceQrCode", "setRequiresInvoiceQrCode", "requiresAmountInput", "getRequiresAmountInput", "setRequiresAmountInput", "customerOrderNote", "getCustomerOrderNote", "setCustomerOrderNote", "taskLiterals", "isPrepaid", "generateImageId", "shouldShowLocationIcon", "evaluateStatus", "shouldShowPayment", "shouldShowCallIcon", "shouldShowShoppingListButton", "shouldShowItemsInReturn", "shouldShowAddressImageIcon", "showTimer", "isCurrentlyActive", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderTask implements Serializable {

    @Nullable
    private Integer actualCompletionSeconds;

    @Nullable
    private OrderAddress address;

    @Nullable
    private List<AddressNoteListItem> allAddressNotes;

    @Nullable
    private List<HandshakeItem> appendages;

    @Nullable
    private Boolean canAddAddressNote;

    @Nullable
    private Float collectAtDelivery;

    @Nullable
    private Date completedAt;

    @Nullable
    private Date createdAt;

    @Nullable
    private String customerOrderNote;

    @Nullable
    private Integer deliveryConfirmationCodeLength;

    @Nullable
    private Boolean deliveryConfirmationCodeRequired;

    @Nullable
    private List<String> deliveryProofImages;

    @Nullable
    private String description;

    @Nullable
    private Integer distanceInMeters;

    @Nullable
    private Boolean eligibleForSupport;

    @Nullable
    private Integer estimatedCompletionSeconds;

    @Nullable
    private Integer etaInSeconds;

    @Nullable
    private AddressNoteListItem firstAddressNote;

    @Nullable
    private List<HandshakeItemGroup> handshakeItemGroups;

    @Nullable
    private List<HandshakeItem> handshakeItems;

    @Nullable
    private Integer id;

    @Nullable
    private String image;

    @Nullable
    private List<Item> items;

    @Nullable
    private String localizedDescription;

    @Nullable
    private LanguageMetaData metaData;

    @Nullable
    private String name;

    @Nullable
    private String orderDisplayId;

    @Nullable
    private Integer orderId;

    @Nullable
    private Float payAtPickup;

    @Nullable
    private Integer rank;

    @Nullable
    private Receipt receipt;

    @Nullable
    private Integer remainingAddressNoteInputSeconds;

    @Nullable
    private Integer remainingHandShakeSeconds;

    @Nullable
    private Boolean requiresAmountInput;

    @Nullable
    private Boolean requiresInvoice;

    @Nullable
    private Boolean requiresInvoiceQrCode;

    @Nullable
    private Boolean requiresQrScan;

    @Nullable
    private Boolean returnableItemsRequired;

    @Nullable
    private Boolean showPaymentType;

    @Nullable
    private Date startedAt;

    @Nullable
    private List<TagDto> tags;

    @Nullable
    private TaskStatus taskStatus;

    @Nullable
    private TaskType taskType;

    @Nullable
    private String warningText;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskType.values().length];
            try {
                iArr[TaskType.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TaskType.DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TaskType.RETURNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TaskType.RETURN_TO_AREA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isCurrentlyActive(boolean evaluateStatus) {
        if (!evaluateStatus || this.taskStatus == TaskStatus.STARTED) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean shouldShowCallIcon$default(OrderTask orderTask, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        return orderTask.shouldShowCallIcon(z2);
    }

    public static /* synthetic */ boolean shouldShowItemsInReturn$default(OrderTask orderTask, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        return orderTask.shouldShowItemsInReturn(z2);
    }

    public static /* synthetic */ boolean shouldShowLocationIcon$default(OrderTask orderTask, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        return orderTask.shouldShowLocationIcon(z2);
    }

    public static /* synthetic */ boolean shouldShowShoppingListButton$default(OrderTask orderTask, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = true;
        }
        return orderTask.shouldShowShoppingListButton(z2);
    }

    @NotNull
    public final String generateImageId() {
        return this.orderId + "-" + this.id;
    }

    @Nullable
    public final Integer getActualCompletionSeconds() {
        return this.actualCompletionSeconds;
    }

    @Nullable
    public final OrderAddress getAddress() {
        return this.address;
    }

    @Nullable
    public final List<AddressNoteListItem> getAllAddressNotes() {
        return this.allAddressNotes;
    }

    @Nullable
    public final List<HandshakeItem> getAppendages() {
        return this.appendages;
    }

    @Nullable
    public final Boolean getCanAddAddressNote() {
        return this.canAddAddressNote;
    }

    @Nullable
    public final Float getCollectAtDelivery() {
        return this.collectAtDelivery;
    }

    @Nullable
    public final Date getCompletedAt() {
        return this.completedAt;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCustomerOrderNote() {
        return this.customerOrderNote;
    }

    @Nullable
    public final Integer getDeliveryConfirmationCodeLength() {
        return this.deliveryConfirmationCodeLength;
    }

    @Nullable
    public final Boolean getDeliveryConfirmationCodeRequired() {
        return this.deliveryConfirmationCodeRequired;
    }

    @Nullable
    public final List<String> getDeliveryProofImages() {
        return this.deliveryProofImages;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getDistanceInMeters() {
        return this.distanceInMeters;
    }

    @Nullable
    public final Boolean getEligibleForSupport() {
        return this.eligibleForSupport;
    }

    @Nullable
    public final Integer getEstimatedCompletionSeconds() {
        return this.estimatedCompletionSeconds;
    }

    @Nullable
    public final Integer getEtaInSeconds() {
        return this.etaInSeconds;
    }

    @Nullable
    public final AddressNoteListItem getFirstAddressNote() {
        return this.firstAddressNote;
    }

    @Nullable
    public final List<HandshakeItemGroup> getHandshakeItemGroups() {
        return this.handshakeItemGroups;
    }

    @Nullable
    public final List<HandshakeItem> getHandshakeItems() {
        return this.handshakeItems;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final List<Item> getItems() {
        return this.items;
    }

    @Nullable
    public final String getLocalizedDescription() {
        return this.localizedDescription;
    }

    @Nullable
    public final LanguageMetaData getMetaData() {
        return this.metaData;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOrderDisplayId() {
        return this.orderDisplayId;
    }

    @Nullable
    public final Integer getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final Float getPayAtPickup() {
        return this.payAtPickup;
    }

    @Nullable
    public final Integer getRank() {
        return this.rank;
    }

    @Nullable
    public final Receipt getReceipt() {
        return this.receipt;
    }

    @Nullable
    public final Integer getRemainingAddressNoteInputSeconds() {
        return this.remainingAddressNoteInputSeconds;
    }

    @Nullable
    public final Integer getRemainingHandShakeSeconds() {
        return this.remainingHandShakeSeconds;
    }

    @Nullable
    public final Boolean getRequiresAmountInput() {
        return this.requiresAmountInput;
    }

    @Nullable
    public final Boolean getRequiresInvoice() {
        return this.requiresInvoice;
    }

    @Nullable
    public final Boolean getRequiresInvoiceQrCode() {
        return this.requiresInvoiceQrCode;
    }

    @Nullable
    public final Boolean getRequiresQrScan() {
        return this.requiresQrScan;
    }

    @Nullable
    public final Boolean getReturnableItemsRequired() {
        return this.returnableItemsRequired;
    }

    @Nullable
    public final Boolean getShowPaymentType() {
        return this.showPaymentType;
    }

    @Nullable
    public final Date getStartedAt() {
        return this.startedAt;
    }

    @Nullable
    public final List<TagDto> getTags() {
        return this.tags;
    }

    @Nullable
    public final TaskStatus getTaskStatus() {
        return this.taskStatus;
    }

    @Nullable
    public final TaskType getTaskType() {
        return this.taskType;
    }

    @Nullable
    public final String getWarningText() {
        return this.warningText;
    }

    public final boolean isPrepaid(@NotNull OrderTask orderTask) {
        float f5;
        float f10;
        Intrinsics.echo(orderTask, "<this>");
        Float f11 = orderTask.payAtPickup;
        if (f11 != null) {
            f5 = f11.floatValue();
        } else {
            f5 = 0.0f;
        }
        Float f12 = orderTask.collectAtDelivery;
        if (f12 != null) {
            f10 = f12.floatValue();
        } else {
            f10 = 0.0f;
        }
        if (f5 == 0.0f && f10 == 0.0f) {
            return true;
        }
        return false;
    }

    public final void setActualCompletionSeconds(@Nullable Integer num) {
        this.actualCompletionSeconds = num;
    }

    public final void setAddress(@Nullable OrderAddress orderAddress) {
        this.address = orderAddress;
    }

    public final void setAllAddressNotes(@Nullable List<AddressNoteListItem> list) {
        this.allAddressNotes = list;
    }

    public final void setAppendages(@Nullable List<HandshakeItem> list) {
        this.appendages = list;
    }

    public final void setCanAddAddressNote(@Nullable Boolean bool) {
        this.canAddAddressNote = bool;
    }

    public final void setCollectAtDelivery(@Nullable Float f5) {
        this.collectAtDelivery = f5;
    }

    public final void setCompletedAt(@Nullable Date date) {
        this.completedAt = date;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setCustomerOrderNote(@Nullable String str) {
        this.customerOrderNote = str;
    }

    public final void setDeliveryConfirmationCodeLength(@Nullable Integer num) {
        this.deliveryConfirmationCodeLength = num;
    }

    public final void setDeliveryConfirmationCodeRequired(@Nullable Boolean bool) {
        this.deliveryConfirmationCodeRequired = bool;
    }

    public final void setDeliveryProofImages(@Nullable List<String> list) {
        this.deliveryProofImages = list;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDistanceInMeters(@Nullable Integer num) {
        this.distanceInMeters = num;
    }

    public final void setEligibleForSupport(@Nullable Boolean bool) {
        this.eligibleForSupport = bool;
    }

    public final void setEstimatedCompletionSeconds(@Nullable Integer num) {
        this.estimatedCompletionSeconds = num;
    }

    public final void setEtaInSeconds(@Nullable Integer num) {
        this.etaInSeconds = num;
    }

    public final void setFirstAddressNote(@Nullable AddressNoteListItem addressNoteListItem) {
        this.firstAddressNote = addressNoteListItem;
    }

    public final void setHandshakeItemGroups(@Nullable List<HandshakeItemGroup> list) {
        this.handshakeItemGroups = list;
    }

    public final void setHandshakeItems(@Nullable List<HandshakeItem> list) {
        this.handshakeItems = list;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setItems(@Nullable List<Item> list) {
        this.items = list;
    }

    public final void setLocalizedDescription(@Nullable String str) {
        this.localizedDescription = str;
    }

    public final void setMetaData(@Nullable LanguageMetaData languageMetaData) {
        this.metaData = languageMetaData;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOrderDisplayId(@Nullable String str) {
        this.orderDisplayId = str;
    }

    public final void setOrderId(@Nullable Integer num) {
        this.orderId = num;
    }

    public final void setPayAtPickup(@Nullable Float f5) {
        this.payAtPickup = f5;
    }

    public final void setRank(@Nullable Integer num) {
        this.rank = num;
    }

    public final void setReceipt(@Nullable Receipt receipt) {
        this.receipt = receipt;
    }

    public final void setRemainingAddressNoteInputSeconds(@Nullable Integer num) {
        this.remainingAddressNoteInputSeconds = num;
    }

    public final void setRemainingHandShakeSeconds(@Nullable Integer num) {
        this.remainingHandShakeSeconds = num;
    }

    public final void setRequiresAmountInput(@Nullable Boolean bool) {
        this.requiresAmountInput = bool;
    }

    public final void setRequiresInvoice(@Nullable Boolean bool) {
        this.requiresInvoice = bool;
    }

    public final void setRequiresInvoiceQrCode(@Nullable Boolean bool) {
        this.requiresInvoiceQrCode = bool;
    }

    public final void setRequiresQrScan(@Nullable Boolean bool) {
        this.requiresQrScan = bool;
    }

    public final void setReturnableItemsRequired(@Nullable Boolean bool) {
        this.returnableItemsRequired = bool;
    }

    public final void setShowPaymentType(@Nullable Boolean bool) {
        this.showPaymentType = bool;
    }

    public final void setStartedAt(@Nullable Date date) {
        this.startedAt = date;
    }

    public final void setTags(@Nullable List<TagDto> list) {
        this.tags = list;
    }

    public final void setTaskStatus(@Nullable TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public final void setTaskType(@Nullable TaskType taskType) {
        this.taskType = taskType;
    }

    public final void setWarningText(@Nullable String str) {
        this.warningText = str;
    }

    public final boolean shouldShowAddressImageIcon() {
        String str;
        TaskStatus taskStatus;
        OrderAddress orderAddress = this.address;
        if (orderAddress != null) {
            str = orderAddress.getImageUrl();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0 && (taskStatus = this.taskStatus) != null && taskStatus.canSeeTaskDetails()) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowCallIcon(boolean evaluateStatus) {
        OrderAddress orderAddress;
        String str;
        TaskStatus taskStatus;
        if (this.taskType != TaskType.RETURN_TO_AREA && (orderAddress = this.address) != null) {
            if (orderAddress != null) {
                str = orderAddress.getPhone();
            } else {
                str = null;
            }
            if (str != null && (taskStatus = this.taskStatus) != null && taskStatus.canSeeTaskDetails()) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldShowItemsInReturn(boolean evaluateStatus) {
        if (this.items == null || !(!r3.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean shouldShowLocationIcon(boolean evaluateStatus) {
        Float f5;
        TaskStatus taskStatus;
        OrderAddress orderAddress = this.address;
        if (orderAddress != null) {
            Float f10 = null;
            if (orderAddress != null) {
                f5 = orderAddress.getLatitude();
            } else {
                f5 = null;
            }
            if (f5 != null) {
                OrderAddress orderAddress2 = this.address;
                if (orderAddress2 != null) {
                    f10 = orderAddress2.getLongitude();
                }
                if (f10 != null && (taskStatus = this.taskStatus) != null && taskStatus.canSeeTaskDetails()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean shouldShowPayment() {
        return isCurrentlyActive(true);
    }

    public final boolean shouldShowShoppingListButton(boolean evaluateStatus) {
        TaskStatus taskStatus;
        if (this.items != null && (!r2.isEmpty()) && (taskStatus = this.taskStatus) != null && taskStatus.canSeeTaskDetails()) {
            return true;
        }
        return false;
    }

    public final boolean showTimer() {
        TaskStatus taskStatus = this.taskStatus;
        if (taskStatus != null && taskStatus.showTimer() && this.startedAt != null) {
            if (this.remainingHandShakeSeconds != null || this.etaInSeconds != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final String taskLiterals() {
        int i4;
        TaskType taskType = this.taskType;
        if (taskType == null) {
            i4 = -1;
        } else {
            i4 = WhenMappings.$EnumSwitchMapping$0[taskType.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    return "";
                }
                return "R";
            }
            return "D";
        }
        return "P";
    }
}
