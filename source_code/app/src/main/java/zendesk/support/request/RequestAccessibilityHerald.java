package zendesk.support.request;

import android.view.View;
import com.zendesk.util.CollectionUtils;
import r1.C2483b;
import zendesk.support.CommentsResponse;
import zendesk.support.R;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.suas.Action;
import zendesk.support.suas.Listener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RequestAccessibilityHerald implements Listener<Action<?>> {
    private final View view;

    public RequestAccessibilityHerald(View view) {
        this.view = view;
    }

    private void announce(int i4, Object... objArr) {
        this.view.announceForAccessibility(this.view.getContext().getString(i4, objArr));
    }

    public static RequestAccessibilityHerald create(RequestActivity requestActivity) {
        return new RequestAccessibilityHerald(requestActivity.findViewById(R.id.activity_request_root));
    }

    @Override // zendesk.support.suas.Listener
    public void update(Action<?> action) {
        Object obj;
        String actionType = action.getActionType();
        actionType.getClass();
        char c3 = 65535;
        switch (actionType.hashCode()) {
            case -1679314784:
                if (actionType.equals("CREATE_COMMENT_SUCCESS")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1319777819:
                if (actionType.equals("CREATE_COMMENT_ERROR")) {
                    c3 = 1;
                    break;
                }
                break;
            case -292168757:
                if (actionType.equals("LOAD_COMMENT_INITIAL")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                announce(R.string.zs_request_announce_comment_created_accessibility, ((ActionCreateComment.CreateCommentResult) action.getData()).getMessage().getPlainBody());
                return;
            case 1:
                announce(R.string.zs_request_announce_comment_failed_accessibility, ((StateMessage) action.getData()).getPlainBody());
                return;
            case 2:
                C2483b c2483b = (C2483b) action.getData();
                if (c2483b == null || (obj = c2483b.alpha) == null || !CollectionUtils.isNotEmpty(((CommentsResponse) obj).getComments())) {
                    return;
                }
                announce(R.string.zs_request_announce_comments_loaded_accessibility, new Object[0]);
                return;
            default:
                return;
        }
    }
}
