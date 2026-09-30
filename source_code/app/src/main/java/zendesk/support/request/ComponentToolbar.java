package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.squareup.picasso.Picasso;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import r1.C2483b;
import x2.C3286g;
import x2.ad;
import x2.aw;
import zendesk.support.R;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentToolbar implements Listener<ToolbarModel> {
    private final ViewToolbarAvatar avatarContainer;
    private final View container;
    private final Context context;
    private final Picasso picasso;
    private final ViewAlmostRealProgressBar progressBar;
    private final TextView subTitle;
    private final TextView title;
    private final Toolbar toolbar;
    private ToolbarModel toolbarModel;
    private final C3286g fadeTransition = new aw();
    private final ToolbarSelector toolbarSelector = new ToolbarSelector();

    /* loaded from: classes.dex */
    public static class ToolbarModel {
        static int STATE_AGENT_INFO = 3;
        static int STATE_LOADING = 1;
        static int STATE_TITLE = 2;
        private final List<StateRequestUser> agent;
        private final boolean isProgressEnabled;
        private final Date lastReply;
        private final int toolbarContentState;

        public ToolbarModel(boolean z2, int i4, List<StateRequestUser> list, Date date) {
            this.isProgressEnabled = z2;
            this.toolbarContentState = i4;
            this.agent = list;
            this.lastReply = date;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                ToolbarModel toolbarModel = (ToolbarModel) obj;
                if (this.isProgressEnabled != toolbarModel.isProgressEnabled || this.toolbarContentState != toolbarModel.toolbarContentState) {
                    return false;
                }
                List<StateRequestUser> list = this.agent;
                if (list == null ? toolbarModel.agent != null : !list.equals(toolbarModel.agent)) {
                    return false;
                }
                Date date = this.lastReply;
                Date date2 = toolbarModel.lastReply;
                if (date != null) {
                    return date.equals(date2);
                }
                if (date2 == null) {
                    return true;
                }
            }
            return false;
        }

        public List<StateRequestUser> getAgents() {
            return this.agent;
        }

        public List<C2483b> getAvatarUrls() {
            ArrayList arrayList = new ArrayList();
            for (StateRequestUser stateRequestUser : this.agent) {
                arrayList.add(new C2483b(stateRequestUser.getAvatar(), stateRequestUser.getName()));
            }
            return arrayList;
        }

        public Date getLastReply() {
            return this.lastReply;
        }

        public String getNameOfFirstAgent() {
            if (CollectionUtils.isNotEmpty(this.agent)) {
                return this.agent.get(0).getName();
            }
            return "";
        }

        public int getToolbarContentState() {
            return this.toolbarContentState;
        }

        public int hashCode() {
            int i4;
            int i5 = (((this.isProgressEnabled ? 1 : 0) * 31) + this.toolbarContentState) * 31;
            List<StateRequestUser> list = this.agent;
            int i10 = 0;
            if (list != null) {
                i4 = list.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = (i5 + i4) * 31;
            Date date = this.lastReply;
            if (date != null) {
                i10 = date.hashCode();
            }
            return i11 + i10;
        }

        public boolean isProgressEnabled() {
            return this.isProgressEnabled;
        }
    }

    /* loaded from: classes.dex */
    public static class ToolbarSelector implements StateSelector<ToolbarModel> {
        private StateMessage findLastAgentReply(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    return stateMessage;
                }
            }
            return null;
        }

        private List<StateRequestUser> getInvolvedAgents(List<StateMessage> list, Map<Long, StateRequestUser> map) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int size = list.size() - 1; size >= 0; size--) {
                StateMessage stateMessage = list.get(size);
                if (map.containsKey(Long.valueOf(stateMessage.getUserId()))) {
                    linkedHashSet.add(map.get(Long.valueOf(stateMessage.getUserId())));
                }
            }
            return new ArrayList(linkedHashSet);
        }

        private boolean isProgressEnabled(State state) {
            if (StateProgress.fomState(state).getRunningRequests() > 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"UseSparseArrays"})
        private Map<Long, StateRequestUser> mapAgents(List<StateRequestUser> list) {
            HashMap hashMap = new HashMap();
            for (StateRequestUser stateRequestUser : list) {
                if (stateRequestUser.isAgent()) {
                    hashMap.put(Long.valueOf(stateRequestUser.getId()), stateRequestUser);
                }
            }
            return hashMap;
        }

        @Override // zendesk.support.suas.StateSelector
        public ToolbarModel selectData(State state) {
            int i4;
            boolean isProgressEnabled = isProgressEnabled(state);
            StateConversation fromState = StateConversation.fromState(state);
            Map<Long, StateRequestUser> mapAgents = mapAgents(fromState.getUsers());
            ArrayList arrayList = new ArrayList();
            if (!StringUtils.hasLength(fromState.getLocalId()) && !StringUtils.hasLength(fromState.getRemoteId())) {
                i4 = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() == 0) {
                i4 = ToolbarModel.STATE_LOADING;
            } else if (fromState.hasAgentReplies() && mapAgents.size() > 0) {
                int i5 = ToolbarModel.STATE_AGENT_INFO;
                StateMessage findLastAgentReply = findLastAgentReply(fromState.getMessages(), mapAgents);
                r4 = findLastAgentReply != null ? findLastAgentReply.getDate() : null;
                arrayList.addAll(getInvolvedAgents(fromState.getMessages(), mapAgents));
                i4 = i5;
            } else {
                i4 = ToolbarModel.STATE_TITLE;
            }
            return new ToolbarModel(isProgressEnabled, i4, arrayList, r4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x2.g, x2.aw] */
    public ComponentToolbar(Picasso picasso, Toolbar toolbar, ViewAlmostRealProgressBar viewAlmostRealProgressBar) {
        this.picasso = picasso;
        this.progressBar = viewAlmostRealProgressBar;
        this.toolbar = toolbar;
        this.context = toolbar.getContext();
        this.container = toolbar.findViewById(R.id.activity_request_toolbar_container);
        this.title = (TextView) toolbar.findViewById(R.id.activity_request_toolbar_custom_title);
        this.subTitle = (TextView) toolbar.findViewById(R.id.activity_request_toolbar_custom_sub_title);
        this.avatarContainer = (ViewToolbarAvatar) toolbar.findViewById(R.id.activity_request_toolbar_avatar_holder);
    }

    private void updateProgressBar(boolean z2) {
        if (z2) {
            this.progressBar.start(ViewAlmostRealProgressBar.DONT_STOP_MOVING);
        } else {
            this.progressBar.stop(300L);
        }
    }

    private void updateToolbar(ToolbarModel toolbarModel) {
        if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_LOADING) {
            this.container.setVisibility(8);
            this.toolbar.setTitle("");
            return;
        }
        if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_AGENT_INFO) {
            this.title.setText(toolbarModel.getNameOfFirstAgent());
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.context, toolbarModel.getLastReply().getTime(), true);
            this.subTitle.setText(this.context.getString(R.string.request_toolbar_last_reply, relativeTimeSpanString));
            this.toolbar.setTitle("");
            this.avatarContainer.setImageUrls(this.picasso, toolbarModel.getAvatarUrls());
            ad.alpha(this.toolbar, this.fadeTransition);
            this.container.setVisibility(0);
            this.container.setContentDescription(this.container.getContext().getString(R.string.zs_request_toolbar_accessibility, toolbarModel.getNameOfFirstAgent(), relativeTimeSpanString));
            return;
        }
        if (toolbarModel.getToolbarContentState() == ToolbarModel.STATE_TITLE) {
            this.container.setVisibility(8);
            this.toolbar.setTitle(R.string.request_activity_title);
        }
    }

    public ToolbarSelector getToolbarSelector() {
        return this.toolbarSelector;
    }

    @Override // zendesk.support.suas.Listener
    public void update(ToolbarModel toolbarModel) {
        if (toolbarModel.equals(this.toolbarModel)) {
            return;
        }
        this.toolbarModel = toolbarModel;
        updateProgressBar(toolbarModel.isProgressEnabled());
        updateToolbar(toolbarModel);
    }
}
