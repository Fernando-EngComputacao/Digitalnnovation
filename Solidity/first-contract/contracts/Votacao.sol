// SPDX-License-Identifier: UNLICENSED
pragma solidity >=0.7.0 <0.9.0;

contract Votacao{
    mapping (string => uint256) public votesReceived;
    string[] public candidateList;

    constructor(string[] memory candidateNames) {
        candidateList = candidateNames;
    }

    function votalVotesFor(string memory candidate) view public returns(uint256){

        require(validCandidate(candidate));

        return votesReceived[candidate];
    }

    function volteForCandidate(string memory candidate) public {
        require(validCandidate(candidate));
        votesReceived[candidate] += 1 ;
    }

    function validCandidate(string memory candidate) view public returns(bool){
        for(uint x = 0; x < candidateList.length; x++ ){
            if (keccak256(abi.encodePacked(candidateList[x])) == keccak256(abi.encodePacked(candidate))){
                return true;
            } 
        }
        return false;
    }

    
}