package com.clevertap.android.sdk.inbox;

import a4.u;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.CTLockManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.DBAdapter;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class CTInboxController {
    private final BaseCallbackManager callbackManager;
    private final CleverTapInstanceConfig config;
    private final CTLockManager ctLockManager;
    private final DBAdapter dbAdapter;
    private ArrayList<CTMessageDAO> messages;
    private final Object messagesLock = new Object();
    private final String userId;
    private final boolean videoSupported;

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Callable<Void> {
        final /* synthetic */ CTInboxMessage val$message;

        public AnonymousClass1(CTInboxMessage cTInboxMessage) {
            r2 = cTInboxMessage;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                try {
                    if (CTInboxController.this._deleteMessageWithId(r2.getMessageId())) {
                        CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Callable<Void> {
        final /* synthetic */ ArrayList val$messageIDs;

        public AnonymousClass2(ArrayList arrayList) {
            r2 = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                try {
                    if (CTInboxController.this._deleteMessagesForIds(r2)) {
                        CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Callable<Void> {
        final /* synthetic */ CTInboxMessage val$message;

        public AnonymousClass3(CTInboxMessage cTInboxMessage) {
            r2 = cTInboxMessage;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                try {
                    if (CTInboxController.this._markReadForMessageWithId(r2.getMessageId())) {
                        CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements Callable<Void> {
        final /* synthetic */ ArrayList val$messageIDs;

        public AnonymousClass4(ArrayList arrayList) {
            r2 = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                try {
                    if (CTInboxController.this._markReadForMessagesWithIds(r2)) {
                        CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements Callable<Void> {
        final /* synthetic */ String val$messageId;

        public AnonymousClass5(String str) {
            r2 = str;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            CTInboxController.this.dbAdapter.deleteMessageForId(r2, CTInboxController.this.userId);
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 implements Callable<Void> {
        final /* synthetic */ ArrayList val$messageIDs;

        public AnonymousClass6(ArrayList arrayList) {
            r2 = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            CTInboxController.this.dbAdapter.deleteMessagesForIDs(r2, CTInboxController.this.userId);
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$7 */
    /* loaded from: classes3.dex */
    public class AnonymousClass7 implements Callable<Void> {
        final /* synthetic */ String val$messageId;

        public AnonymousClass7(String str) {
            r2 = str;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            CTInboxController.this.dbAdapter.markReadMessageForId(r2, CTInboxController.this.userId);
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.inbox.CTInboxController$8 */
    /* loaded from: classes3.dex */
    public class AnonymousClass8 implements Callable<Void> {
        final /* synthetic */ ArrayList val$messageIDs;

        public AnonymousClass8(ArrayList arrayList) {
            r2 = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            CTInboxController.this.dbAdapter.markReadMessagesForIds(r2, CTInboxController.this.userId);
            return null;
        }
    }

    public CTInboxController(CleverTapInstanceConfig cleverTapInstanceConfig, String str, DBAdapter dBAdapter, CTLockManager cTLockManager, BaseCallbackManager baseCallbackManager, boolean z2) {
        this.userId = str;
        this.dbAdapter = dBAdapter;
        this.messages = dBAdapter.getMessages(str);
        this.videoSupported = z2;
        this.ctLockManager = cTLockManager;
        this.callbackManager = baseCallbackManager;
        this.config = cleverTapInstanceConfig;
    }

    private CTMessageDAO findMessageById(String str) {
        synchronized (this.messagesLock) {
            try {
                Iterator<CTMessageDAO> it = this.messages.iterator();
                while (it.hasNext()) {
                    CTMessageDAO next = it.next();
                    if (next.getId().equals(str)) {
                        return next;
                    }
                }
                Logger.v("Inbox Message for message id - " + str + " not found");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void lambda$_markReadForMessageWithId$0(Void r12) {
        this.callbackManager._notifyInboxMessagesDidUpdate();
    }

    public static /* synthetic */ void lambda$_markReadForMessageWithId$1(String str, Exception exc) {
        Logger.d("Failed to update message read state for id:" + str, exc);
    }

    public /* synthetic */ void lambda$_markReadForMessagesWithIds$2(Void r12) {
        this.callbackManager._notifyInboxMessagesDidUpdate();
    }

    public static /* synthetic */ void lambda$_markReadForMessagesWithIds$3(ArrayList arrayList, Exception exc) {
        Logger.d("Failed to update message read state for ids:" + arrayList, exc);
    }

    private void trimMessages() {
        Logger.v("CTInboxController:trimMessages() called");
        ArrayList arrayList = new ArrayList();
        synchronized (this.messagesLock) {
            try {
                Iterator<CTMessageDAO> it = this.messages.iterator();
                while (it.hasNext()) {
                    CTMessageDAO next = it.next();
                    if (!this.videoSupported && next.containsVideoOrAudio()) {
                        Logger.d("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                        arrayList.add(next);
                    } else {
                        long expires = next.getExpires();
                        if (expires > 0 && System.currentTimeMillis() / 1000 > expires) {
                            Logger.v("Inbox Message: " + next.getId() + " is expired - removing");
                            arrayList.add(next);
                        }
                    }
                }
                if (arrayList.size() <= 0) {
                    return;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    _deleteMessageWithId(((CTMessageDAO) it2.next()).getId());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean _deleteMessageWithId(String str) {
        CTMessageDAO findMessageById = findMessageById(str);
        if (findMessageById == null) {
            return false;
        }
        synchronized (this.messagesLock) {
            this.messages.remove(findMessageById);
        }
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("RunDeleteMessage", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.5
            final /* synthetic */ String val$messageId;

            public AnonymousClass5(String str2) {
                r2 = str2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                CTInboxController.this.dbAdapter.deleteMessageForId(r2, CTInboxController.this.userId);
                return null;
            }
        });
        return true;
    }

    public boolean _deleteMessagesForIds(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            CTMessageDAO findMessageById = findMessageById(it.next());
            if (findMessageById != null) {
                arrayList2.add(findMessageById);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        synchronized (this.messagesLock) {
            this.messages.removeAll(arrayList2);
        }
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("RunDeleteMessagesForIDs", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.6
            final /* synthetic */ ArrayList val$messageIDs;

            public AnonymousClass6(ArrayList arrayList3) {
                r2 = arrayList3;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                CTInboxController.this.dbAdapter.deleteMessagesForIDs(r2, CTInboxController.this.userId);
                return null;
            }
        });
        return true;
    }

    public boolean _markReadForMessageWithId(String str) {
        CTMessageDAO findMessageById = findMessageById(str);
        if (findMessageById == null) {
            return false;
        }
        synchronized (this.messagesLock) {
            findMessageById.setRead(1);
        }
        Task postAsyncSafelyTask = CTExecutorFactory.executors(this.config).postAsyncSafelyTask();
        postAsyncSafelyTask.addOnSuccessListener(new b(this, 0));
        postAsyncSafelyTask.addOnFailureListener(new c(str, 0));
        postAsyncSafelyTask.execute("RunMarkMessageRead", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.7
            final /* synthetic */ String val$messageId;

            public AnonymousClass7(String str2) {
                r2 = str2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                CTInboxController.this.dbAdapter.markReadMessageForId(r2, CTInboxController.this.userId);
                return null;
            }
        });
        return true;
    }

    public boolean _markReadForMessagesWithIds(ArrayList<String> arrayList) {
        Boolean bool = Boolean.FALSE;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            CTMessageDAO findMessageById = findMessageById(it.next());
            if (findMessageById != null) {
                bool = Boolean.TRUE;
                synchronized (this.messagesLock) {
                    findMessageById.setRead(1);
                }
            }
        }
        if (!bool.booleanValue()) {
            return false;
        }
        Task postAsyncSafelyTask = CTExecutorFactory.executors(this.config).postAsyncSafelyTask();
        postAsyncSafelyTask.addOnSuccessListener(new b(this, 1));
        postAsyncSafelyTask.addOnFailureListener(new u(14, arrayList));
        postAsyncSafelyTask.execute("RunMarkMessagesReadForIDs", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.8
            final /* synthetic */ ArrayList val$messageIDs;

            public AnonymousClass8(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                CTInboxController.this.dbAdapter.markReadMessagesForIds(r2, CTInboxController.this.userId);
                return null;
            }
        });
        return true;
    }

    public int count() {
        return getMessages().size();
    }

    public void deleteInboxMessage(CTInboxMessage cTInboxMessage) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("deleteInboxMessage", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.1
            final /* synthetic */ CTInboxMessage val$message;

            public AnonymousClass1(CTInboxMessage cTInboxMessage2) {
                r2 = cTInboxMessage2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                    try {
                        if (CTInboxController.this._deleteMessageWithId(r2.getMessageId())) {
                            CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    public void deleteInboxMessagesForIDs(ArrayList<String> arrayList) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("deleteInboxMessagesForIDs", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.2
            final /* synthetic */ ArrayList val$messageIDs;

            public AnonymousClass2(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                    try {
                        if (CTInboxController.this._deleteMessagesForIds(r2)) {
                            CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    public CTMessageDAO getMessageForId(String str) {
        return findMessageById(str);
    }

    public ArrayList<CTMessageDAO> getMessages() {
        ArrayList<CTMessageDAO> arrayList;
        synchronized (this.messagesLock) {
            trimMessages();
            arrayList = this.messages;
        }
        return arrayList;
    }

    public ArrayList<CTMessageDAO> getUnreadMessages() {
        ArrayList<CTMessageDAO> arrayList = new ArrayList<>();
        synchronized (this.messagesLock) {
            try {
                Iterator<CTMessageDAO> it = getMessages().iterator();
                while (it.hasNext()) {
                    CTMessageDAO next = it.next();
                    if (next.isRead() == 0) {
                        arrayList.add(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void markReadInboxMessage(CTInboxMessage cTInboxMessage) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("markReadInboxMessage", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.3
            final /* synthetic */ CTInboxMessage val$message;

            public AnonymousClass3(CTInboxMessage cTInboxMessage2) {
                r2 = cTInboxMessage2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                    try {
                        if (CTInboxController.this._markReadForMessageWithId(r2.getMessageId())) {
                            CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    public void markReadInboxMessagesForIDs(ArrayList<String> arrayList) {
        CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("markReadInboxMessagesForIDs", new Callable<Void>() { // from class: com.clevertap.android.sdk.inbox.CTInboxController.4
            final /* synthetic */ ArrayList val$messageIDs;

            public AnonymousClass4(ArrayList arrayList2) {
                r2 = arrayList2;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (CTInboxController.this.ctLockManager.getInboxControllerLock()) {
                    try {
                        if (CTInboxController.this._markReadForMessagesWithIds(r2)) {
                            CTInboxController.this.callbackManager._notifyInboxMessagesDidUpdate();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    public int unreadCount() {
        return getUnreadMessages().size();
    }

    public boolean updateMessages(JSONArray jSONArray) {
        Logger.v("CTInboxController:updateMessages() called");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            try {
                CTMessageDAO initWithJSON = CTMessageDAO.initWithJSON(jSONArray.getJSONObject(i4), this.userId);
                if (initWithJSON != null) {
                    if (!this.videoSupported && initWithJSON.containsVideoOrAudio()) {
                        Logger.d("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    } else {
                        arrayList.add(initWithJSON);
                        Logger.v("Inbox Message for message id - " + initWithJSON.getId() + " added");
                    }
                }
            } catch (JSONException e) {
                Logger.d("Unable to update notification inbox messages - " + e.getLocalizedMessage());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        this.dbAdapter.upsertMessages(arrayList);
        Logger.v("New Notification Inbox messages added");
        synchronized (this.messagesLock) {
            this.messages = this.dbAdapter.getMessages(this.userId);
            trimMessages();
        }
        return true;
    }
}
