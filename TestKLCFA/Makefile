

all: clean klcfa.apk

clean:
	echo "CLEAN ..... "
	rm -rf klcfa
	rm -f klcfa.apk

klcfa.apk: klcfa.dex
	echo "GENERATE APK ..... "
	mkdir klcfa
	touch klcfa/AndroidManifest.xml
	mv klcfa.dex klcfa/classes.dex
	zip -j -r klcfa.apk klcfa/ 
	
klcfa.dex :
	echo "COMPILE TO DEX ..... "
	dx --verbose --no-strict --dex  --output="klcfa.dex" bin/