package ru.denchinside.killnarrator.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.client.util.NarratorManager;

@Mixin(NarratorManager.class)
public class NarratorManagerMixin {

	@Overwrite
	public void narrate(net.minecraft.text.Text text) {
		return;
	}

	@Overwrite
	public void narrate(java.lang.String text) {
		return;
	}

	@Overwrite
	public void onChatMessage(net.minecraft.network.MessageType type, net.minecraft.text.Text message, java.util.UUID sender) {
		return;
	}


	@Overwrite
	public void addToast(net.minecraft.client.option.NarratorMode option) {
		return;
	}  
}
