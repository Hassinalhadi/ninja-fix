package com.clevertap.android.sdk.inbox;

/* loaded from: classes3.dex */
public enum CTInboxMessageType {
    SimpleMessage("simple"),
    IconMessage("message-icon"),
    CarouselMessage("carousel"),
    CarouselImageMessage("carousel-image");

    private final String inboxMessageType;

    CTInboxMessageType(String str) {
        this.inboxMessageType = str;
    }

    public static CTInboxMessageType fromString(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1799711058:
                if (str.equals("carousel-image")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1332589953:
                if (str.equals("message-icon")) {
                    c3 = 1;
                    break;
                }
                break;
            case -902286926:
                if (str.equals("simple")) {
                    c3 = 2;
                    break;
                }
                break;
            case 2908512:
                if (str.equals("carousel")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return CarouselImageMessage;
            case 1:
                return IconMessage;
            case 2:
                return SimpleMessage;
            case 3:
                return CarouselMessage;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.inboxMessageType;
    }
}
