package com.clevertap.android.sdk.validation;

/* loaded from: classes3.dex */
public class ValidationResultFactory {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ValidationResult create(int i4, int i5, String... strArr) {
        ValidationResult validationResult = new ValidationResult();
        validationResult.setErrorCode(i4);
        String str = "";
        if (i4 != 531) {
            try {
                switch (i4) {
                    case 510:
                        if (i5 == 11) {
                            str = strArr[0] + "... exceeds the limit of " + strArr[1] + " characters. Trimmed";
                            break;
                        } else if (i5 == 14) {
                            str = "Event Name is null";
                            break;
                        } else {
                            break;
                        }
                    case 511:
                        if (i5 == 7) {
                            str = "For event " + strArr[0] + ": Property value for property " + strArr[1] + " wasn't a primitive (" + strArr[2] + ")";
                        } else if (i5 != 15) {
                            break;
                        } else {
                            str = "An item's object value for key " + strArr[0] + " wasn't a primitive (" + strArr[1] + ")";
                        }
                        break;
                    case 512:
                        if (i5 != 25) {
                            switch (i5) {
                                case 1:
                                    str = "Invalid multi value for key " + strArr[0] + ", profile multi value operation aborted.";
                                    break;
                                case 2:
                                    str = "Profile push key is empty";
                                    break;
                                case 3:
                                    str = "Object value wasn't a primitive (" + strArr[0] + ") for profile field " + strArr[1];
                                    break;
                                case 4:
                                    str = "Device country code not available and profile phone: " + strArr[0] + " does not appear to start with country code";
                                    break;
                                case 5:
                                    str = "Invalid phone number";
                                    break;
                                case 6:
                                    str = "Key is empty, profile removeValueForKey aborted.";
                                    break;
                                case 7:
                                    str = "For event \"" + strArr[0] + "\": Property value for property " + strArr[1] + " wasn't a primitive (" + strArr[2] + ")";
                                    break;
                                case 8:
                                    str = "ChannelId is required for API 26+ but not provided in the notification payload. Falling to default channel: " + strArr[0];
                                    break;
                                case 9:
                                    str = "Unable to render notification on channelId: " + strArr[0] + " as it is not registered by the app. Falling to default channel: ";
                                    break;
                                case 10:
                                    str = "Recording of Notification Viewed is disabled in the CleverTap Dashboard for notification payload: " + strArr[0];
                                    break;
                            }
                        } else {
                            str = "Increment/Decrement value for profile key " + strArr[0] + ", cannot be zero or negative";
                        }
                        break;
                    case 513:
                        if (i5 == 16) {
                            str = strArr[0] + " is a restricted event name. Last event aborted.";
                        } else if (i5 != 17) {
                            break;
                        } else {
                            str = strArr[0] + " is a discarded event name. Last event aborted.";
                        }
                        break;
                    case 514:
                        switch (i5) {
                            case 18:
                                str = "CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml/Instance Configuration. CleverTap SDK will create a fallback device ID";
                                break;
                            case 19:
                                str = "CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml. Custom CleverTap ID passed will not be used.";
                                break;
                            case 20:
                                str = "CleverTap ID - " + strArr[0] + " already exists. Unable to set custom CleverTap ID - " + strArr[1];
                                break;
                            case 21:
                                str = "Attempted to set invalid custom CleverTap ID - " + strArr[0] + ", falling back to default error CleverTap ID - " + strArr[1];
                                break;
                        }
                        break;
                    default:
                        switch (i4) {
                            case 521:
                                switch (i5) {
                                    case 11:
                                        str = strArr[0] + "... exceeds the limit of " + strArr[1] + " characters. Trimmed";
                                        break;
                                    case 12:
                                        str = "Multi value property for key " + strArr[0] + " exceeds the limit of " + strArr[1] + " items. Trimmed";
                                        break;
                                    case 13:
                                        str = "Invalid user profile property array count - " + strArr[0] + " max is - " + strArr[1];
                                        break;
                                }
                                break;
                            case 522:
                                str = "Charged event contained more than 50 items.";
                                break;
                            case 523:
                                if (i5 == 23) {
                                    str = "Invalid multi-value property key " + strArr[0];
                                } else if (i5 == 24) {
                                    str = strArr[0] + "... is a restricted key for multi-value properties. Operation aborted.";
                                }
                                break;
                        }
                }
            } catch (Exception unused) {
            }
        } else {
            str = "Profile Identifiers mismatch with the previously saved ones";
        }
        validationResult.setErrorDesc(str);
        return validationResult;
    }

    public static ValidationResult create(int i4) {
        return create(i4, -1, new String[0]);
    }
}
