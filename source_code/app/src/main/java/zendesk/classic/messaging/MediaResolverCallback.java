package zendesk.classic.messaging;

import com.zendesk.logger.Logger;
import java.io.File;
import java.util.List;
import zendesk.core.Callback;

/* loaded from: classes.dex */
public class MediaResolverCallback extends Callback<List<File>> {
    private static final String LOG_TAG = "MediaResolverCallback";
    private final EventFactory eventFactory;
    private final EventListener eventListener;

    public MediaResolverCallback(EventListener eventListener, EventFactory eventFactory) {
        this.eventListener = eventListener;
        this.eventFactory = eventFactory;
    }

    @Override // zendesk.core.Callback
    /* renamed from: success, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$internalSuccess$0(List<File> list) {
        Logger.d(LOG_TAG, "Uris have been resolved, collecting files to send the event", new Object[0]);
        if (list.isEmpty()) {
            Logger.w(LOG_TAG, "No files resolved. No event will be sent", new Object[0]);
        } else {
            Logger.d(LOG_TAG, "Sending attachment event", new Object[0]);
            this.eventListener.onEvent(this.eventFactory.sendAttachment(list));
        }
    }
}
