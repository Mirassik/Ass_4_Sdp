public class Main {
    public static void main(String[] args) {
        ChatRoomFactory chatRoomFactory = new ChatRoomFactory();

        ChatRoom generalChat = chatRoomFactory.createChatRoom("General");
        ChatRoom techChat = chatRoomFactory.createChatRoom("Tech");

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");

        generalChat.registerObserver(user1);
        generalChat.registerObserver(user2);
        techChat.registerObserver(user2);
        techChat.registerObserver(user3);

        generalChat.sendMessage("Hello, everyone!");
        techChat.sendMessage("Any tech news to share?");
    }
}