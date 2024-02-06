package api.invoking;

import java.util.HashMap;
import java.util.Map;

/**
 * An enumeration of right-click menu actions.
 */
public enum MenuAction
{
	/**
	 * Menu action for using an item in your inventory on a tile object (GameObject or GroundObject).
	 */
	@Deprecated
	ITEM_USE_ON_GAME_OBJECT(1),
	/**
	 * Menu action for using a widget on a tile object (GameObject or GroundObject).
	 */
	WIDGET_TARGET_ON_GAME_OBJECT(2),
	/**
	 * First menu action for a game object.
	 */
	GAME_OBJECT_FIRST_OPTION(3),
	/**
	 * Second menu action for a game object.
	 */
	GAME_OBJECT_SECOND_OPTION(4),
	/**
	 * Third menu action for a game object.
	 */
	GAME_OBJECT_THIRD_OPTION(5),
	/**
	 * Fourth menu action for a game object.
	 */
	GAME_OBJECT_FOURTH_OPTION(6),
	/**
	 * Fifth menu action for a game object.
	 */
	GAME_OBJECT_FIFTH_OPTION(1001),

	/**
	 * Menu action for using an item in your inventory on an NPC.
	 */
	@Deprecated
	ITEM_USE_ON_NPC(7),
	/**
	 * Menu action for using a widget on an NPC.
	 */
	WIDGET_TARGET_ON_NPC(8),
	/**
	 * First menu action for an NPC.
	 */
	NPC_FIRST_OPTION(9),
	/**
	 * Second menu action for an NPC.
	 */
	NPC_SECOND_OPTION(10),
	/**
	 * Third menu action for an NPC.
	 */
	NPC_THIRD_OPTION(11),
	/**
	 * Fourth menu action for an NPC.
	 */
	NPC_FOURTH_OPTION(12),
	/**
	 * Fifth menu action for an NPC.
	 */
	NPC_FIFTH_OPTION(13),

	/**
	 * Menu action for using an item on a player.
	 */
	@Deprecated
	ITEM_USE_ON_PLAYER(14),
	/**
	 * Menu action for using a widget on a player.
	 */
	WIDGET_TARGET_ON_PLAYER(15),

	/**
	 * Menu action for using an item on an item on the ground.
	 */
	@Deprecated
	ITEM_USE_ON_GROUND_ITEM(16),
	/**
	 * Menu action for using a widget on an item on the ground.
	 */
	WIDGET_TARGET_ON_GROUND_ITEM(17),
	/**
	 * First menu action for an item on the ground.
	 */
	GROUND_ITEM_FIRST_OPTION(18),
	/**
	 * Second menu action for an item on the ground.
	 */
	GROUND_ITEM_SECOND_OPTION(19),
	/**
	 * Third menu action for an item on the ground.
	 */
	GROUND_ITEM_THIRD_OPTION(20),
	/**
	 * Fourth menu action for an item on the ground.
	 */
	GROUND_ITEM_FOURTH_OPTION(21),
	/**
	 * Fifth menu action for an item on the ground.
	 */
	GROUND_ITEM_FIFTH_OPTION(22),

	/**
	 * Menu action for walking.
	 */
	WALK(23),

	/**
	 * Interaction with widget (type 1).
	 */
	WIDGET_TYPE_1(24),
	/**
	 * Select the widget for targeting other widgets/entites etc.
	 */
	WIDGET_TARGET(25),
	/**
	 * Performs an ifclose.
	 */
	WIDGET_CLOSE(26),
	/**
	 * Interaction with widget (type 4).
	 */
	WIDGET_TYPE_4(28),
	/**
	 * Interaction with widget (type 5).
	 */
	WIDGET_TYPE_5(29),
	/**
	 * Performs a Continue
	 */
	WIDGET_CONTINUE(30),
	/**
	 * Menu action when using an item on another item
	 */
	@Deprecated
	ITEM_USE_ON_ITEM(31),
	/**
	 * Menu action when using a component on an item
	 */
	@Deprecated
	WIDGET_USE_ON_ITEM(32),

	/**
	 * First menu action for an item.
	 */
	@Deprecated
	ITEM_FIRST_OPTION(33),
	/**
	 * Second menu action for an item.
	 */
	@Deprecated
	ITEM_SECOND_OPTION(34),
	/**
	 * Third menu action for an item.
	 */
	@Deprecated
	ITEM_THIRD_OPTION(35),
	/**
	 * Fourth menu action for an item.
	 */
	@Deprecated
	ITEM_FOURTH_OPTION(36),
	/**
	 * Fifth menu action for an item.
	 */
	@Deprecated
	ITEM_FIFTH_OPTION(37),
	/**
	 * Menu action to use an item.
	 */
	@Deprecated
	ITEM_USE(38),

	/**
	 * First menu action for a widget.
	 */
	WIDGET_FIRST_OPTION(39),
	/**
	 * Second menu action for a widget.
	 */
	WIDGET_SECOND_OPTION(40),
	/**
	 * Third menu action for a widget.
	 */
	WIDGET_THIRD_OPTION(41),
	/**
	 * Fourth menu action for a widget.
	 */
	WIDGET_FOURTH_OPTION(42),
	/**
	 * Fifth menu action for a widget.
	 */
	WIDGET_FIFTH_OPTION(43),

	PLAYER_FIRST_OPTION(44),
	PLAYER_SECOND_OPTION(45),
	PLAYER_THIRD_OPTION(46),
	PLAYER_FOURTH_OPTION(47),
	PLAYER_FIFTH_OPTION(48),
	PLAYER_SIXTH_OPTION(49),
	PLAYER_SEVENTH_OPTION(50),
	PLAYER_EIGHTH_OPTION(51),

	/**
	 * Menu action for normal priority child component actions.
	 */
	CC_OP(57),

	/**
	 * Using a widget on another widget
	 */
	WIDGET_TARGET_ON_WIDGET(58),

	/**
	 * Menu action triggered by examining an object.
	 */
	EXAMINE_OBJECT(1002),
	/**
	 * Menu action triggered by examining an NPC.
	 */
	EXAMINE_NPC(1003),
	/**
	 * Menu action triggered by examining item on ground.
	 */
	EXAMINE_ITEM_GROUND(1004),
	/**
	 * Menu action triggered by examining item in inventory.
	 */
	@Deprecated
	EXAMINE_ITEM(1005),
	/**
	 * Menu action triggered by canceling a menu.
	 */
	CANCEL(1006),
	/**
	 * Menu action for low priority child component actions.
	 */
	CC_OP_LOW_PRIORITY(1007),
	/**
	 * Menu action triggered by following a player.
	 */
	FOLLOW(2046),
	/**
	 * Menu action triggered by sending a trade offer to a player.
	 */
	TRADE(2047),

	/**
	 * Menu action triggered when the id is not defined in this class.
	 */
	UNKNOWN(-1);

	private static final Map<Integer, MenuAction> map = new HashMap<>();

	static
	{
		for (MenuAction menuAction : values())
		{
			map.put(menuAction.getId(), menuAction);
		}
	}

	private final int id;

	MenuAction(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public static MenuAction of(int id)
	{
		return map.getOrDefault(id, UNKNOWN);
	}
}
