package zendesk.classic.messaging.ui;

import android.content.res.Resources;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zendesk.classic.messaging.MessagingActivityScope;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;

@MessagingActivityScope
/* loaded from: classes.dex */
public class MessagingCellPropsFactory {
    private final int defaultSpacing;
    private final int groupSpacing;

    /* loaded from: classes.dex */
    public enum InteractionType {
        QUERY,
        RESPONSE,
        NONE
    }

    public MessagingCellPropsFactory(Resources resources) {
        this.defaultSpacing = resources.getDimensionPixelSize(R.dimen.zui_cell_vertical_spacing_default);
        this.groupSpacing = resources.getDimensionPixelSize(R.dimen.zui_cell_vertical_spacing_group);
    }

    private static InteractionType classifyInteraction(MessagingItem messagingItem) {
        if (messagingItem instanceof MessagingItem.Response) {
            return InteractionType.RESPONSE;
        }
        if (!(messagingItem instanceof MessagingItem.Query) && !(messagingItem instanceof MessagingItem.OptionsResponse)) {
            return InteractionType.NONE;
        }
        return InteractionType.QUERY;
    }

    private MessagingCellProps generateCellProps(MessagingItem messagingItem, MessagingItem messagingItem2, MessagingItem messagingItem3) {
        return new MessagingCellProps(labelVisibility(messagingItem2, messagingItem), cellSpacing(messagingItem2, messagingItem3), avatarVisibility(messagingItem2, messagingItem3));
    }

    public int avatarVisibility(MessagingItem messagingItem, MessagingItem messagingItem2) {
        InteractionType classifyInteraction = classifyInteraction(messagingItem);
        if (classifyInteraction == InteractionType.QUERY) {
            return 4;
        }
        if (messagingItem2 == null || classifyInteraction != classifyInteraction(messagingItem2)) {
            return 0;
        }
        if (!(messagingItem instanceof MessagingItem.Response) || !(messagingItem2 instanceof MessagingItem.Response) || ((MessagingItem.Response) messagingItem).getAgentDetails().getAgentId().equals(((MessagingItem.Response) messagingItem2).getAgentDetails().getAgentId())) {
            return 4;
        }
        return 0;
    }

    public int cellSpacing(MessagingItem messagingItem, MessagingItem messagingItem2) {
        if (messagingItem2 == null) {
            return this.defaultSpacing;
        }
        if (messagingItem2 instanceof MessagingItem.SystemMessage) {
            return this.groupSpacing;
        }
        if (classifyInteraction(messagingItem) == classifyInteraction(messagingItem2)) {
            return this.groupSpacing;
        }
        return this.defaultSpacing;
    }

    public List<MessagingCellProps> create(List<MessagingItem> list) {
        MessagingItem messagingItem;
        if (CollectionUtils.isEmpty(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i4 = 0;
        while (i4 < list.size()) {
            MessagingItem messagingItem2 = null;
            if (i4 > 0) {
                messagingItem = list.get(i4 - 1);
            } else {
                messagingItem = null;
            }
            MessagingItem messagingItem3 = list.get(i4);
            i4++;
            if (i4 < list.size()) {
                messagingItem2 = list.get(i4);
            }
            arrayList.add(generateCellProps(messagingItem, messagingItem3, messagingItem2));
        }
        return arrayList;
    }

    public int labelVisibility(MessagingItem messagingItem, MessagingItem messagingItem2) {
        InteractionType classifyInteraction = classifyInteraction(messagingItem);
        if (classifyInteraction == InteractionType.QUERY || messagingItem2 == null || classifyInteraction != classifyInteraction(messagingItem2)) {
            return 0;
        }
        if ((messagingItem instanceof MessagingItem.Response) && (messagingItem2 instanceof MessagingItem.Response) && !((MessagingItem.Response) messagingItem).getAgentDetails().getAgentId().equals(((MessagingItem.Response) messagingItem2).getAgentDetails().getAgentId())) {
            return 0;
        }
        return 8;
    }
}
