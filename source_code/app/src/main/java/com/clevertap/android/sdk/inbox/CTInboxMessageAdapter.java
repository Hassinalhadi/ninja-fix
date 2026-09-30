package com.clevertap.android.sdk.inbox;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.R;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class CTInboxMessageAdapter extends az {
    private static final int CAROUSEL = 2;
    private static final int ICON = 1;
    private static final int IMAGE_CAROUSEL = 3;
    private static final int SIMPLE = 0;
    private CTInboxListViewFragment fragment;
    private ArrayList<CTInboxMessage> inboxMessages;

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxMessageAdapter$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType;

        static {
            int[] iArr = new int[CTInboxMessageType.values().length];
            $SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType = iArr;
            try {
                iArr[CTInboxMessageType.SimpleMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType[CTInboxMessageType.IconMessage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType[CTInboxMessageType.CarouselMessage.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType[CTInboxMessageType.CarouselImageMessage.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public CTInboxMessageAdapter(ArrayList<CTInboxMessage> arrayList, CTInboxListViewFragment cTInboxListViewFragment) {
        Logger.v("CTInboxMessageAdapter: messages=" + arrayList);
        this.inboxMessages = arrayList;
        this.fragment = cTInboxListViewFragment;
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.inboxMessages.size();
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        int i5 = AnonymousClass1.$SwitchMap$com$clevertap$android$sdk$inbox$CTInboxMessageType[this.inboxMessages.get(i4).getType().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                return 1;
            }
            if (i5 == 3) {
                return 2;
            }
            if (i5 == 4) {
                return 3;
            }
            return -1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(f0 f0Var, int i4) {
        ((CTInboxBaseMessageViewHolder) f0Var).configureWithMessage(this.inboxMessages.get(i4), this.fragment, i4);
    }

    @Override // androidx.recyclerview.widget.az
    public CTInboxBaseMessageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 == 0) {
            return new CTSimpleMessageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inbox_simple_message_layout, viewGroup, false));
        }
        if (i4 == 1) {
            return new CTIconMessageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inbox_icon_message_layout, viewGroup, false));
        }
        if (i4 == 2) {
            return new CTCarouselMessageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inbox_carousel_text_layout, viewGroup, false));
        }
        if (i4 != 3) {
            return null;
        }
        return new CTCarouselImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.inbox_carousel_layout, viewGroup, false));
    }
}
