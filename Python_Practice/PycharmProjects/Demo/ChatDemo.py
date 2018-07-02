import itchat
from itchat.content import *


@itchat.msg_register(TEXT, isFriendChat=True, isGroupChat=False, isMpChat=False)
def simple_reply(msg):
    if msg.text == '我爱你':
        return '我也爱你'
    if msg.text == '恋爱纪念日':
        return '2018年3月11日'
    if msg.text == '我想你':
        return '我也想你'
    if msg.text =='时光隧道':
        return  '时光让我们相恋第 90-91 天'


itchat.auto_login()  # 可设置hotReload = True
itchat.run()
# itchat.send('Hello', toUserName='filehelper')
