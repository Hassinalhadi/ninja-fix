package zendesk.support.request;

import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r1.C2483b;
import zendesk.support.CommentResponse;
import zendesk.support.CommentsResponse;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.request.ActionCreateComment;
import zendesk.support.request.StateConversation;
import zendesk.support.suas.Action;
import zendesk.support.suas.Reducer;

/* loaded from: classes.dex */
class ReducerConversation extends Reducer<StateConversation> {
    @Override // zendesk.support.suas.Reducer
    public /* bridge */ /* synthetic */ StateConversation reduce(StateConversation stateConversation, Action action) {
        return reduce2(stateConversation, (Action<?>) action);
    }

    @Override // zendesk.support.suas.Reducer
    public StateConversation getInitialState() {
        return new StateConversation();
    }

    /* renamed from: reduce, reason: avoid collision after fix types in other method */
    public StateConversation reduce2(StateConversation stateConversation, Action<?> action) {
        String actionType = action.getActionType();
        actionType.getClass();
        char c3 = 65535;
        switch (actionType.hashCode()) {
            case -1720252100:
                if (actionType.equals("REQUEST_CLOSED")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1679314784:
                if (actionType.equals("CREATE_COMMENT_SUCCESS")) {
                    c3 = 1;
                    break;
                }
                break;
            case -1319777819:
                if (actionType.equals("CREATE_COMMENT_ERROR")) {
                    c3 = 2;
                    break;
                }
                break;
            case -1193398337:
                if (actionType.equals("LOAD_COMMENTS_UPDATE_SUCCESS")) {
                    c3 = 3;
                    break;
                }
                break;
            case -1049833133:
                if (actionType.equals("DELETE_MESSAGE")) {
                    c3 = 4;
                    break;
                }
                break;
            case -903772976:
                if (actionType.equals("CREATE_REQUEST_SUCCESS")) {
                    c3 = 5;
                    break;
                }
                break;
            case -16010570:
                if (actionType.equals("LOAD_COMMENTS_INITIAL_SUCCESS")) {
                    c3 = 6;
                    break;
                }
                break;
            case 207206879:
                if (actionType.equals("START_CONFIG")) {
                    c3 = 7;
                    break;
                }
                break;
            case 397298627:
                if (actionType.equals("ATTACHMENT_DOWNLOADED")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 619382558:
                if (actionType.equals("CLEAR_MESSAGES")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 962828474:
                if (actionType.equals("LOAD_REQUEST_SUCCESS")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1532422677:
                if (actionType.equals("CREATE_REQUEST_ERROR")) {
                    c3 = 11;
                    break;
                }
                break;
            case 1712998531:
                if (actionType.equals("LOAD_COMMENTS_FROM_CACHE_SUCCESS")) {
                    c3 = '\f';
                    break;
                }
                break;
            case 1921186300:
                if (actionType.equals("CREATE_COMMENT")) {
                    c3 = '\r';
                    break;
                }
                break;
            case 2066480684:
                if (actionType.equals("CREATE_REQUEST")) {
                    c3 = 14;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return stateConversation.newBuilder().setStatus(RequestStatus.Closed).build();
            case 1:
            case 5:
                ActionCreateComment.CreateCommentResult createCommentResult = (ActionCreateComment.CreateCommentResult) action.getData();
                StateIdMapper addIdMapping = stateConversation.getMessageIdMapper().addIdMapping(Long.valueOf(createCommentResult.getCommentRemoteId()), Long.valueOf(createCommentResult.getMessage().getId()));
                StateIdMapper attachmentIdMapper = stateConversation.getAttachmentIdMapper();
                for (Map.Entry<Long, Long> entry : createCommentResult.getLocalToRemoteAttachments().getLocalToRemoteIdMap().entrySet()) {
                    attachmentIdMapper = attachmentIdMapper.addIdMapping(entry.getValue(), entry.getKey());
                }
                return stateConversation.newBuilder().setRemoteId(createCommentResult.getRequestId()).setMessageIdMapper(addIdMapping).setAttachmentIdMapper(attachmentIdMapper).setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), Collections.singletonList(createCommentResult.getMessage()))).build();
            case 2:
            case 11:
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), Collections.singletonList((StateMessage) action.getData()))).build();
            case 3:
            case 6:
                C2483b c2483b = (C2483b) action.getData();
                List<CommentResponse> comments = ((CommentsResponse) c2483b.alpha).getComments();
                Collections.reverse(comments);
                C2483b convert = StateRequestAttachment.convert(comments, (Map<Long, MediaResult>) c2483b.bravo, stateConversation.getAttachmentIdMapper());
                C2483b convert2 = StateMessage.convert(comments, stateConversation.getMessageIdMapper(), (Map) convert.alpha);
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.mergeMessages(stateConversation.getMessages(), (List) convert2.alpha)).setAttachmentIdMapper(((StateIdMapper) convert.bravo).copy()).setMessageIdMapper(((StateIdMapper) convert2.bravo).copy()).setUsers(StateMessageMergeUtil.mergeUsers(stateConversation.getUsers(), StateRequestUser.convert(((CommentsResponse) c2483b.alpha).getUsers()))).build();
            case 4:
                return stateConversation.newBuilder().setMessages(StateMessageMergeUtil.removeMessageById(((StateMessage) action.getData()).getId(), stateConversation.getMessages())).build();
            case 7:
                RequestConfiguration requestConfiguration = (RequestConfiguration) action.getData();
                return stateConversation.newBuilder().setLocalId(requestConfiguration.getLocalRequestId()).setRemoteId(requestConfiguration.getRequestId()).setStatus(requestConfiguration.getRequestStatus()).setHasAgentReplies(requestConfiguration.hasAgentReplies()).build();
            case '\b':
                C2483b c2483b2 = (C2483b) action.getData();
                StateRequestAttachment stateRequestAttachment = (StateRequestAttachment) c2483b2.alpha;
                MediaResult mediaResult = (MediaResult) c2483b2.bravo;
                StateRequestAttachment build = stateRequestAttachment.newBuilder().setLocalFile(mediaResult.getFile()).setLocalUri(mediaResult.getUri().toString()).build();
                List<StateMessage> messages = stateConversation.getMessages();
                ArrayList arrayList = new ArrayList(messages.size());
                Iterator<StateMessage> it = messages.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().withUpdatedAttachment(build));
                }
                return stateConversation.newBuilder().setMessages(arrayList).build();
            case '\t':
                return stateConversation.newBuilder().setMessages(Collections.EMPTY_LIST).setMessageIdMapper(new StateIdMapper()).setAttachmentIdMapper(new StateIdMapper()).build();
            case '\n':
                Request request = (Request) action.getData();
                return stateConversation.newBuilder().setStatus(request.getStatus()).setHasAgentReplies(CollectionUtils.isNotEmpty(request.getLastCommentingAgents())).build();
            case '\f':
                StateConversation stateConversation2 = (StateConversation) action.getData();
                return stateConversation.newBuilder().setMessages(stateConversation2.getMessages()).setAttachmentIdMapper(stateConversation2.getAttachmentIdMapper()).setMessageIdMapper(stateConversation2.getMessageIdMapper()).setUsers(stateConversation2.getUsers()).build();
            case '\r':
            case 14:
                StateConversation.Builder newBuilder = stateConversation.newBuilder();
                StateMessage stateMessage = (StateMessage) action.getData();
                List<StateMessage> copyOf = CollectionUtils.copyOf(stateConversation.getMessages());
                copyOf.add(stateMessage);
                return newBuilder.setMessages(copyOf).build();
            default:
                return null;
        }
    }
}
