<p align="center">
  <img src="https://media.discordapp.net/attachments/816647374239694849/1093840479809982484/28257755c5deeff97ce4bf62098f603111aefb8dda39a3ee5e6b4b0d3255bfef95601890afd80709da39a3ee5e6b4b0d3255bfef95601890afd807097cdc7aa3142c83a91767a05d1cc59834.png">
</p>

<br>

# ProtocolRanges

<p>Block too high and too low protocols on your minecraft server</p>
<p>REQUIRES VIAVERSION</p>
<p>Get protocol versions from https://minecraft.fandom.com/wiki/Protocol_version</p>
<p>Tested minecraft versions: </p> 

`1.19.3`

# Installation

<p>Put ProtocolRanges.jar to your plugins folder and restart the server.</p>

# Configuration

`Use § sign instead of & for colors`

<details><summary>config.yml</summary>

`minProtocol` - Minimum protocol with player can join<br>
`maxProtocol` - Maximum protocol with player can join<br>
`tooLowMessage` - If player's protocol is too low player will be kicked with that message<br>
`tooHighMessage` - If player's protocol is too high player will be kicked with that message<br>

## Default configuration:

```yml
config:
  minProtocol: 759
  maxProtocol: 762
  tooLowMessage: "§cYou have too low version!"
  tooHighMessage: "§cYou have too high version!"
```

</details>
