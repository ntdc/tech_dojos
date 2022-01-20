const getAboutUsLink = require("./index");
test("Returns about-us for english language", () => {
    expect(getAboutUsLink("en-US")).toBe("/about-us");
});

test("Do not return /o-nas for czeck language", () =>{
	expect(getAboutUsLink("cs-CZ")).not.toBe("/o-nas");
});