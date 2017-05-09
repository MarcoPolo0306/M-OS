local w,h = term.getSize()
local nextVer = "4"

function printCentered(msg, height)
term.setCursorPos(w/2 - #msg/2, height)
term.write(msg)
end
function printWrappedRight(msg, height)
term.setCursorPos(w - #msg, height)
term.write(msg)
end

term.setCursorPos(1,1)
term.setBackgroundColor(colors.black)
term.setTextColor(colors.white)
term.clear()

local w,h = term.getSize()

function printCentered(msg, height)
  term.setCursorPos(w/2 - #msg/2, height)
  term.write(msg)
end

function drawMenu1()
  term.setBackgroundColor(colors.black)
  term.clear()
  printCentered("Updates were found!",1)
  printCentered("Would you like to update?",2)
  term.setBackgroundColor(colors.gray)
  printCentered(" > Yes < ",5)
  term.setBackgroundColor(colors.black)
  printCentered(" No ",6)
end

function drawMenu2()
  term.setBackgroundColor(colors.black)
  term.clear()
  printCentered("Updates were found!",1)
  printCentered("Would you like to update?",2)
  term.setBackgroundColor(colors.black)
  printCentered(" Yes ",5)
  term.setBackgroundColor(colors.gray)
  printCentered(" > No < ",6)
end

drawMenu1()

selection = 1

if not fs.exists("m-os/desktop") then
  term.setBackgroundColor(colors.red)
  term.clear()
  term.setBackgroundColor(colors.gray)
  term.setCursorPos(1,1)
  term.clearLine()
  term.setTextColor(colors.white)
  print("Could not find file.")
  term.setBackgroundColor(colors.red)
  term.setCursorPos(1,2)
  print("M-OS could not find the file: m-os/desktop")
  print("If you would like to reinstall M-OS when you reboot, type Y. If not, type n.")
  sleep(1000000)
end

if not fs.exists("m-os/images/bground") then
  term.setBackgroundColor(colors.red)
  term.clear()
  term.setBackgroundColor(colors.gray)
  term.setCursorPos(1,1)
  term.clearLine()
  term.setTextColor(colors.white)
  print("Could not find file.")
  term.setBackgroundColor(colors.red)
  term.setCursorPos(1,2)
  print("M-OS could not find the file: m-os/images/bground")
  print("If you would like to reinstall M-OS when you reboot, type Y. If not, type n.")
  sleep(1000000)
end

if not fs.exists("m-os/settings") then
  term.setBackgroundColor(colors.red)
  term.clear()
  term.setBackgroundColor(colors.gray)
  term.setCursorPos(1,1)
  term.clearLine()
  term.setTextColor(colors.white)
  print("Could not find file.")
  term.setBackgroundColor(colors.red)
  term.setCursorPos(1,2)
  print("M-OS could not find the file: m-os/settings")
  print("If you would like to reinstall M-OS when you reboot, type Y. If not, type n.")
  sleep(1000000)
end

if not fs.exists("m-os/programs/installed_programs") then
  term.setBackgroundColor(colors.red)
  term.clear()
  term.setBackgroundColor(colors.gray)
  term.setCursorPos(1,1)
  term.clearLine()
  term.setTextColor(colors.white)
  print("Could not find file.")
  term.setBackgroundColor(colors.red)
  term.setCursorPos(1,2)
  print("M-OS could not find the file: m-os/programs.installed_programs")
  print("If you would like to reinstall M-OS when you reboot, type Y. If not, type n.")
  sleep(1000000)
end

function update()
	
end

term.setTextColor(colors.white)
term.setBackgroundColor(colors.lightGray)
term.clear()
term.setTextColor(colors.white)
term.setCursorPos(1,1)
print("(C) 2016, 2017 MarcoSoft")
term.setCursorPos(w-4,1)
print("1.1.5")

term.setCursorPos(1,1)
print("(C) 2016, 2017 MarcoSoft")
term.setCursorPos(w-4,1)
print("1.1.4")
local logo = paintutils.loadImage("m-os/images/logo")
paintutils.drawImage(logo,w/2-6,h/2-4)
term.setBackgroundColor(colors.lightGray)
printCentered("Loading..",h/2+5)
term.setBackgroundColor(colors.white)
term.setCursorPos(w / 2 - 19 / 2,h/2+3)
textutils.slowWrite("                   ",25)
shell.run("setup2")