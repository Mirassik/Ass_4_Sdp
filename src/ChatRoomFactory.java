public class ChatRoomFactory {
    public ChatRoom createChatRoom(String name) {
        return new ChatRoom(name);
    }
}
