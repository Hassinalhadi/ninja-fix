package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerAttachments extends Reducer<StateAttachments> {
    private static final String LOG_FORMAT_ATTACHMENT_DROPPED = "Cannot add attachment %s. Size is %d, max attachment size is %d.";
    private static final String LOG_MESSAGE_ATTACHMENTS_DISABLED = "Cannot add attachments, they are disabled in your Zendesk settings.";

    public static List<StateRequestAttachment> updateSelectedAttachments(List<StateRequestAttachment> list, StateAttachments stateAttachments) {
        HashSet hashSet = new HashSet();
        Iterator<StateRequestAttachment> it = stateAttachments.getSelectedAttachments().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getLocalUri());
        }
        ArrayList arrayList = new ArrayList();
        for (StateRequestAttachment stateRequestAttachment : list) {
            if (!hashSet.contains(stateRequestAttachment.getLocalUri())) {
                arrayList.add(stateRequestAttachment);
            }
        }
        return CollectionUtils.combineLists(arrayList, stateAttachments.getSelectedAttachments());
    }

    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateAttachments reduce(StateAttachments stateAttachments, Action action) {
        return reduce2(stateAttachments, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateAttachments getInitialState() {
        return new StateAttachments();
    }

    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateAttachments reduce2(StateAttachments stateAttachments, Action<?> action) {
        String actionType = action.getActionType();
        actionType.getClass();
        char c3 = 65535;
        switch (actionType.hashCode()) {
            case -1326172566:
                if (actionType.equals("ATTACHMENTS_SELECTED")) {
                    c3 = 0;
                    break;
                }
                break;
            case -635275733:
                if (actionType.equals("ATTACHMENTS_DESELECTED")) {
                    c3 = 1;
                    break;
                }
                break;
            case -91317760:
                if (actionType.equals("LOAD_SETTINGS_SUCCESS")) {
                    c3 = 2;
                    break;
                }
                break;
            case 207206879:
                if (actionType.equals("START_CONFIG")) {
                    c3 = 3;
                    break;
                }
                break;
            case 979542142:
                if (actionType.equals("CLEAR_ATTACHMENTS")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                List list = (List) action.getData();
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(StateRequestAttachment.convert((MediaResult) it.next()));
                }
                return stateAttachments.newBuilder().addAllSelectedAttachments(arrayList).setSelectedAttachments(updateSelectedAttachments(arrayList, stateAttachments)).build();
            case 1:
                List list2 = (List) action.getData();
                HashSet hashSet = new HashSet();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(((MediaResult) it2.next()).getOriginalUri());
                }
                ArrayList arrayList2 = new ArrayList();
                for (StateRequestAttachment stateRequestAttachment : stateAttachments.getSelectedAttachments()) {
                    if (!hashSet.contains(stateRequestAttachment.getParsedLocalUri())) {
                        arrayList2.add(stateRequestAttachment);
                    }
                }
                return stateAttachments.newBuilder().setSelectedAttachments(arrayList2).build();
            case 2:
                StateSettings stateSettings = (StateSettings) action.getData();
                ArrayList arrayList3 = new ArrayList();
                if (stateSettings.isAttachmentsEnabled()) {
                    long maxAttachmentSize = stateSettings.getMaxAttachmentSize();
                    for (StateRequestAttachment stateRequestAttachment2 : stateAttachments.getSelectedAttachments()) {
                        if (stateRequestAttachment2.getSize() > maxAttachmentSize) {
                            Logger.d("RequestActivity", LOG_FORMAT_ATTACHMENT_DROPPED, stateRequestAttachment2.getName(), Long.valueOf(stateRequestAttachment2.getSize()), Long.valueOf(maxAttachmentSize));
                        } else {
                            arrayList3.add(stateRequestAttachment2);
                        }
                    }
                    return stateAttachments.newBuilder().setSelectedAttachments(arrayList3).build();
                }
                Logger.w("RequestActivity", LOG_MESSAGE_ATTACHMENTS_DISABLED, new Object[0]);
                return new StateAttachments();
            case 3:
                List<StateRequestAttachment> files = ((RequestConfiguration) action.getData()).getFiles();
                return stateAttachments.newBuilder().addAllSelectedAttachments(files).setSelectedAttachments(files).build();
            case 4:
                return new StateAttachments();
            default:
                return null;
        }
    }
}
