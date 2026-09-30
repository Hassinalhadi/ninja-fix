package zendesk.support.request;

import android.annotation.SuppressLint;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeSet;
import r1.C2483b;

/* loaded from: classes.dex */
class StateMessageMergeUtil {
    private StateMessageMergeUtil() {
    }

    public static List<StateMessage> mergeMessages(List<StateMessage> list, List<StateMessage> list2) {
        C2483b mergeRemoteMessagesById = mergeRemoteMessagesById(list, list2);
        boolean isEmpty = CollectionUtils.isEmpty((Collection) mergeRemoteMessagesById.bravo);
        Object obj = mergeRemoteMessagesById.alpha;
        if (isEmpty) {
            return (List) obj;
        }
        return mergeRemoteMessagesBySortOrder((List) obj, (List) mergeRemoteMessagesById.bravo);
    }

    @SuppressLint({"UseSparseArrays"})
    private static C2483b mergeRemoteMessagesById(List<StateMessage> list, List<StateMessage> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (StateMessage stateMessage : list2) {
            linkedHashMap.put(Long.valueOf(stateMessage.getId()), stateMessage);
        }
        ArrayList arrayList = new ArrayList();
        for (StateMessage stateMessage2 : list) {
            if (linkedHashMap.containsKey(Long.valueOf(stateMessage2.getId()))) {
                arrayList.add(synchronizeAttachmentOrder(stateMessage2, (StateMessage) linkedHashMap.remove(Long.valueOf(stateMessage2.getId()))));
            } else {
                arrayList.add(stateMessage2);
            }
        }
        return new C2483b(arrayList, new ArrayList(linkedHashMap.values()));
    }

    private static List<StateMessage> mergeRemoteMessagesBySortOrder(List<StateMessage> list, List<StateMessage> list2) {
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(size + size2);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= size && i5 >= size2) {
                return arrayList;
            }
            if (i4 >= size || i5 >= size2) {
                break;
            }
            StateMessage stateMessage = list.get(i4);
            StateMessage stateMessage2 = list2.get(i5);
            if (stateMessage.getId() == stateMessage2.getId()) {
                arrayList.add(synchronizeAttachmentOrder(stateMessage, stateMessage2));
                i4++;
            } else if (stateMessage.getDate().before(stateMessage2.getDate())) {
                arrayList.add(stateMessage);
                i4++;
            } else {
                arrayList.add(stateMessage2);
            }
            i5++;
        }
        if (i4 < size) {
            arrayList.addAll(list.subList(i4, size));
            return arrayList;
        }
        arrayList.addAll(list2.subList(i5, size2));
        return arrayList;
    }

    public static List<StateRequestUser> mergeUsers(List<StateRequestUser> list, List<StateRequestUser> list2) {
        TreeSet treeSet = new TreeSet(new Comparator<StateRequestUser>() { // from class: zendesk.support.request.StateMessageMergeUtil.2
            @Override // java.util.Comparator
            public int compare(StateRequestUser stateRequestUser, StateRequestUser stateRequestUser2) {
                return (int) (stateRequestUser.getId() - stateRequestUser2.getId());
            }
        });
        treeSet.addAll(list2);
        treeSet.addAll(list);
        return new ArrayList(treeSet);
    }

    public static List<StateMessage> removeMessageById(long j5, List<StateMessage> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (StateMessage stateMessage : list) {
            if (stateMessage.getId() != j5) {
                arrayList.add(stateMessage);
            }
        }
        return arrayList;
    }

    @SuppressLint({"UseSparseArrays"})
    public static StateMessage synchronizeAttachmentOrder(StateMessage stateMessage, StateMessage stateMessage2) {
        if (CollectionUtils.isEmpty(stateMessage2.getAttachments())) {
            return stateMessage2;
        }
        final HashMap hashMap = new HashMap();
        int size = stateMessage.getAttachments().size();
        for (int i4 = 0; i4 < size; i4++) {
            hashMap.put(Long.valueOf(stateMessage.getAttachments().get(i4).getId()), Integer.valueOf(i4));
        }
        ArrayList arrayList = new ArrayList(stateMessage2.getAttachments());
        Collections.sort(arrayList, new Comparator<StateRequestAttachment>() { // from class: zendesk.support.request.StateMessageMergeUtil.1
            @Override // java.util.Comparator
            public int compare(StateRequestAttachment stateRequestAttachment, StateRequestAttachment stateRequestAttachment2) {
                Integer num = (Integer) hashMap.get(Long.valueOf(stateRequestAttachment.getId()));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(stateRequestAttachment2.getId()));
                if (num == null && num2 == null) {
                    return 0;
                }
                if (num2 == null) {
                    return 1;
                }
                if (num == null) {
                    return -1;
                }
                return num.intValue() - num2.intValue();
            }
        });
        return stateMessage2.withAttachments(arrayList);
    }
}
