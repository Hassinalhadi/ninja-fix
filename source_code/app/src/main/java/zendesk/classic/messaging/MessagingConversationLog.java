package zendesk.classic.messaging;

import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@MessagingScope
/* loaded from: classes.dex */
public class MessagingConversationLog implements ConversationLog {
    private static final Comparator<MessagingEvent> TIMESTAMP_COMPARATOR = new Comparator<MessagingEvent>() { // from class: zendesk.classic.messaging.MessagingConversationLog.1
        @Override // java.util.Comparator
        public int compare(MessagingEvent messagingEvent, MessagingEvent messagingEvent2) {
            return messagingEvent.getTimestamp().compareTo(messagingEvent2.getTimestamp());
        }
    };
    private final MessagingEventSerializer messagingEventSerializer;
    private final List<MessagingItem> messagingItems = new ArrayList();
    private final List<Event> events = new ArrayList();

    public MessagingConversationLog(MessagingEventSerializer messagingEventSerializer) {
        this.messagingEventSerializer = messagingEventSerializer;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    @Override // zendesk.classic.messaging.ConversationLog
    public String getLog() {
        ArrayList arrayList = new ArrayList(this.events.size() + this.messagingItems.size());
        arrayList.addAll(this.messagingItems);
        arrayList.addAll(this.events);
        if (CollectionUtils.isEmpty(arrayList)) {
            return "";
        }
        Collections.sort(arrayList, TIMESTAMP_COMPARATOR);
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String serialize = this.messagingEventSerializer.serialize((MessagingEvent) arrayList.get(i4));
            if (StringUtils.hasLength(serialize)) {
                sb2.append(serialize);
                if (i4 < arrayList.size() - 1) {
                    sb2.append("\n");
                }
            }
        }
        return sb2.toString();
    }

    public void setMessagingItems(List<MessagingItem> list) {
        this.messagingItems.clear();
        if (CollectionUtils.isNotEmpty(list)) {
            this.messagingItems.addAll(list);
        }
    }
}
